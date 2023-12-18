import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int A, B, T;
        int result;
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        T = scan.nextInt();

        result = B * (T / A);

        System.out.println(result);
    }
}