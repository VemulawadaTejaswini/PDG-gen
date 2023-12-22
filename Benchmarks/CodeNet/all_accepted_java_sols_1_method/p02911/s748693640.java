import java.util.Scanner;

// 単純に正解者以外を-1ポイントするとループが増えてTLEになるので、
// 正解に着目して敗退判定を工夫する
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long K = Long.parseLong(scanner.next());
        int Q = Integer.parseInt(scanner.next());

        int[] A = new int[Q];

        for (int i = 0; i < Q; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        long[] ansCount = new long[N];

        // 答えを処理していく
        for (int i = 0; i < Q; i++) {
            // 正解した人を++
            int correctIndex = A[i] - 1;
            ansCount[correctIndex]++;
        }

        // 0ポイント以下は敗退
        for (int i = 0; i < N; i++) {
            // 初期ポイント - 問題数 + 正解数 が 1以上であればOK
            boolean isWin = K - Q + ansCount[i] >= 1;
            System.out.println(isWin ? "Yes" : "No");
        }
    }
}
