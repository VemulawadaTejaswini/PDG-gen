

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            int p = i + 1;
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += (a[j] - p) * (a[j] - p);
            }

            ans = Math.min(ans, count);
        }
        System.out.println(ans);
    }
}
