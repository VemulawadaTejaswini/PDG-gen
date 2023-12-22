import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = Long.parseLong(sc.next());
        int Q = Integer.parseInt(sc.next());

        int[] A = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        // 合っている人のみ抽出
        int[] challenger = new int[N];
        for (int i = 0; i < Q; i++) {
            int acPerson = A[i];
            challenger[acPerson - 1]++;
        }

        // 最大点数で初期化
        long[] amount = new long[N];
        for (int i = 0; i < N; i++) {
            amount[i] = K;
        }

        // 合ってるポイント分減算して減らす
        for (int i = 0; i < N; i++) {
            int acCount = challenger[i];
            int minusPoint = Q - acCount;

            amount[i] -= minusPoint;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(amount[i] > 0 ? "Yes" : "No");
        }
    }
}

