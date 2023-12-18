import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
            // 入力
            Scanner         sc = new Scanner(System.in);
            int             n = Integer.parseInt(sc.next());
            // 1オリジンで処理する
            int[]           A = new int[n + 1];
            for (int i = 0; i < n; i++) {
                A[i + 1] = Integer.parseInt(sc.next());
            }
            sc.close();

            // 計数ソート
            int[]           B = new int[n + 1];
            countingSort(A, B, 10000);

            // 出力
            StringBuilder   builder = new StringBuilder();
            builder.append(B[1]);
            for (int i = 2; i <= n; i++) {
                builder.append(' ').append(B[i]);
            }
            System.out.println(builder);
    }

    /**
     * 
     * @param A
     * @param B     Aをソートした結果を返す
     * @param k     Aの要素の最大値
     */
    static void countingSort(int[] A,int[] B, int k) {
        int[]       C = new int[k];

        // C[i]に出現数を記録する、A配列の要素の値が添字になる
        for (int j = 1; j < A.length; j++) {
            C[A[j]]++;
        }

        // C[i]にi以下の出現数を記録する
        // 例えばC[5]にはC[4]以前の出現数の合計が記録される
        for (int i = 1; i < k; i++) {
            C[i] = C[i] + C[i - 1];
        }

        // 後ろから選んでいくと安定なソートになる
        for (int j = A.length - 1; j > 0; j--) {
            B[C[A[j]]] = A[j];
            // 要素をコピーしたら、1減らす。同じ値の要素があるため
            C[A[j]]--;
        }
    }
}

