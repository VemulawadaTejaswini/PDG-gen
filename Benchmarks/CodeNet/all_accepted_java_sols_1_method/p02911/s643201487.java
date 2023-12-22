import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int Q = in.nextInt();
            int[] A = new int[Q];
            for (int i = 0; i < Q; i++) {
                A[i] = in.nextInt() - 1;
            }

            int[] win = new int[N];
            for (int i = 0; i < Q; i++) {
                win[A[i]]++;
            }

            boolean[] isWin = new boolean[N];
            for (int i = 0; i < N; i++) {
                isWin[i] = K - (Q - win[i]) > 0;
            }

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < N; i++) {
                res.append(isWin[i] ? "Yes" : "No").append("\n");
            }
            System.out.print(res.toString());
        }
    }
}
