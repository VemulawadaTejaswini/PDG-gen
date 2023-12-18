import java.util.*;

public class Main {
    static int n;
    static int[] A = new int [50];

    static boolean solve(int i, int m) {
        // mになる組み合わせが見つかった
        if (m == 0) return true;
        // 与えられた数列の長さnを越えてしまった
        if (i >= n) return false;

        // 次の整数へ進める。i番目の整数を選んだ場合と選ばなかった場合
        boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);
        return res;
    }
    public static void main(String[] args) throws Exception {
        int q, m;

        Scanner sc = new Scanner(System.in);
        // 数列の長さ
        n = Integer.parseInt(sc.next());
        // 数列
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        // mの数
        q = Integer.parseInt(sc.next());
        // q回検証する
        for (int i = 0; i < q; i++) {
            m = Integer.parseInt(sc.next());
            if (solve(0, m)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}

