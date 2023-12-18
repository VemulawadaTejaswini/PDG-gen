import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int j = 0; j < N - K; j++) {
            int before = A[j];
            int after = A[j + K];
            if (before < after) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
