import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int n;
    public static int q;
    public static boolean memo[];
    public static int a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        q = sc.nextInt();
        int m[] = new int[q];
        for (int i = 0; i < q; i++)
            m[i] = sc.nextInt();
        memo = new boolean[500000];

        rec(0, 0);

        for (int i = 0; i < q; i++) {
            if (memo[m[i]] == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }

    public static void rec(int index, int sum) {
        if (index == n) {
            memo[sum] = true;
            return;
        }
        rec(index + 1, sum);
        rec(index + 1, sum + a[index]);
    }
}
