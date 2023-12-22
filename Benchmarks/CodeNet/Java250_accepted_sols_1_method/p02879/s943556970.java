import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        if (0 < A && A < 10 && 0 < B && B < 10) {
            System.out.println(A * B);
        } else {
            System.out.println(-1);
        }

        s.close();
    }
}