import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int[] B = new int[N];
                for (int i = 0; i < N - 1; i++) {
                        int A = scanner.nextInt();
                        B[A - 1]++;
                }

                for (int i = 0; i < N; i++)
                        System.out.println(B[i]);
        }
}