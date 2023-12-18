import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;

        // j = 割る数
        for (int j = k + 1; j <= n; j++) {
            // 割る数未満でk以上の数について加算
            ans += j - k;

            // 割る数より大きい数について加算
            // 割る数より大きい数の個数
            int count = n - j;
            // 割る数より大きい数を割る数で割った時の余りがk以上になり始めるindex
            int start = Math.max(0, k - 1);
            int length = j - k;
            int setCount = count / j;
            int surplus = count % j;
            ans += setCount * length;
            if (surplus >= start) {
                ans += surplus - start;
            }
        }
        System.out.println(ans);
    }
}