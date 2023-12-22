import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }

            System.out.println(sum >= H ? "Yes" : "No");
        }
    }
}