import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int ans = 0;
        double nearestGap = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            double value = t - (sc.nextInt() * 0.006);
            double gap = Math.abs(value - a);
            if (gap < nearestGap) {
                nearestGap = gap;
                ans = i;
            }
        }

        // 出力
        System.out.println(++ans);
    }
}
