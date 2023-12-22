import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int i = Integer.parseInt(scan.nextLine().replace(" ", ""));
        if(isSquareNumber(i)) System.out.println("Yes");
        else System.out.println("No");

        scan.close();
        
    }

    static boolean isSquareNumber (int number) {
        double sqrtOfNumber = Math.sqrt(number);
        return (isInteger(sqrtOfNumber));
    }

    static boolean isInteger (double number) {
        return (number == Math.floor(number));
    }

}