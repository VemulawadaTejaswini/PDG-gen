import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int K = sc.nextInt();
            if (K <= A) {
                System.out.println(K);
                return;
            }
            if (K <= A + B) {
                System.out.println(A);
                return;
            }
            System.out.println(A - (K - (A + B)));
        }
    }
}
