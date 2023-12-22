import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int M = Integer.parseInt(s.next());
        // 問題毎、正解しているかどうか(配列でやらないと遅い)
        boolean[] completed = new boolean[N];
        // 問題毎、wa数
        int[] wa = new int[N];
        // 求めたいものたち
        int acCount = 0;
        int waCount = 0;
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(s.next()) - 1;
            // 正解している問題ならなにもしない
            if (completed[p]) {
                s.next();
                continue;
            }
            String S = s.next();
            if (Objects.equals(S, "WA")) {
                // 問題毎、wa数を記録する
                wa[p]++;
            } else {
                // 正解数と、wa数を増加(wa数は正解時のみカウントする)
                acCount++;
                waCount += wa[p];
                completed[p] = true;
            }
        }
        System.out.println(acCount + " " + waCount);
    }

}
