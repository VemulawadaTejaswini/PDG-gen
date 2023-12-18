import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if (B % A == 0) {
            System.out.print(B + A);
        } else {
            System.out.print(B - A);
        }
    }
}