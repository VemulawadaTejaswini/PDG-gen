import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int[] mm = new int[m];
        for (int i = 0; i < n; i++) {
            int kk = sc.nextInt();
            for (int j = 0; j < kk; j++) {
                mm[sc.nextInt() - 1]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (mm[i] == n)
                ans++;
        }
        System.out.println(ans);
    }
}