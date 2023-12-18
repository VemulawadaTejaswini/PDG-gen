import java.util.Scanner;

/**
 * A - Multiplication 1
 * A×B を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( a * b );

        sc.close();
    }
}