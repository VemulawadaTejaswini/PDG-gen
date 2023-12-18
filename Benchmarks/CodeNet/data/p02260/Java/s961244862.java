import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int mini = i;
            for (int j = i; j < N; j++) {
                if (A[mini] > A[j]) {
                    mini = j;
                }
            }
            if (mini != i) {
                int tmp = A[mini];
                A[mini] = A[i];
                A[i] = tmp;
                cnt++;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + ((i == N - 1) ? "\n" : " "));
        }
        System.out.println(cnt);
    }
}