import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] hArr = new int[n];

        for (int i = 0; i < n; i++) {
            hArr[i] = sc.nextInt();
        }

        double diff = Math.abs((double) a - ((double)t - (double)hArr[0] * 0.006));
        int ans = 1;
        for (int i = 1; i < hArr.length; i++) {
            double tmpDiff = Math.abs((double) a - ((double)t - (double)hArr[i] * 0.006));
            if (diff > tmpDiff) {
                diff = tmpDiff;
                ans = i + 1;
            }
        }

        System.out.println(ans);
    }
}
