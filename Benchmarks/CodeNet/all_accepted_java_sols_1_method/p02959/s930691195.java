import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0 ; i < n + 1 ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
        }
        long ans = 0;
        int res = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] - b[i] >= 0) {
                ans += (long) b[i];
            } else {
                ans += (long) a[i];
                res = b[i] - a[i];
                ans += (long) Math.min(res, a[i + 1]);
                a[i + 1] = Math.max(0, a[i + 1] - res);
            }
        }
        System.out.println(ans);
    }

}
