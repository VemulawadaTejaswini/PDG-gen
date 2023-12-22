import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int a = scan.nextInt();
        int b = scan.nextInt();

        // calc
        int plus = a + b;
        int minus = a - b;
        int multiple = a * b;

        // answer
        System.out.println(Math.max(plus, Math.max(minus, multiple)));

    }
}