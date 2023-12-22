import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt(); // T - 標高 x 0.006
        int a = sc.nextInt(); // 目標の値
        int[] hArr = new int[n];

        for (int i = 0; i < n; i++) {
            hArr[i] = sc.nextInt();
        }

        double res = 10000.0d;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            double tmpRes = t - (hArr[i] * 0.006);
            if (res > (Math.abs(a - tmpRes))) {
                res = Math.abs(a - tmpRes);
                ans = i;
            }
        }

        System.out.println(ans+1);
    }
}
