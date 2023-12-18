import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                System.out.println(ans);
                System.exit(0);
            } else if (i == a.length - 1 && a[i] != x) {
                System.out.println(ans);
                System.exit(0);
            }
            x -= a[i];
            ans++;
        }
        System.out.println(ans);
    }

}
