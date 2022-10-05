import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);
     
        private static String getString(String prompt) {
        System.out.println(prompt);
        String answer1 = inputScanner.nextLine();
        return answer1;
        }
        
    
    private static double getDouble(String prompt) {
       System.out.println(prompt);
        double answer2 = inputScanner.nextDouble();
        return answer2;
    }
    

    public static void main(String[] args) {
        Calculator calc = new Calculator();
       double num1 = getDouble("Please enter the first number.");
       inputScanner.nextDouble();
       double num2 = getDouble("Please enter your second number");
       

       double answer = calc.add(num1,num2);
       System.out.println(answer);
       


    }
}