import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n; i >= 1; i--) {
            int c = 0;
            for (int j = i; j <= n; j+= i) if (ans[j-1] == 1) c++;
            if (a[i-1] == c % 2) continue;
            cnt++;
            ans[i - 1] = 1;
        }
        System.out.println(cnt);
        for (int i = 1; i <= n; i++) {
            if (ans[i - 1] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
