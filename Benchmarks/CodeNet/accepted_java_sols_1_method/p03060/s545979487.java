

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vs = new int[n];
        int[] cs = new int[n];
        for (int i = 0; i < n; i++) {
            vs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cs[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = vs[i] - cs[i];
            if (a > 0) {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
