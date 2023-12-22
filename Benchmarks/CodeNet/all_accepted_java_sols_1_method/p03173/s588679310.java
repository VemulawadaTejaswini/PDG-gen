import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt();
        }
        long[][] dp = new long[n][n];
        long[] values = new long[n];
        values[0] = arr[0];
        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Long.MAX_VALUE;
                }
            }
            if(i > 0) {
                values[i] = values[i - 1] + arr[i];
            }
        }

        for(int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
               int left = j;
               int right = j + i - 1;
               long min = Long.MAX_VALUE;
               for (int k = j; k <right; k++) {
                   long value = dp[left][k] + dp[k + 1][right] + (values[right] - (left > 0 ? values[left - 1] : 0));
                   if (value < min) {
                       min = value;
                   }
               }
               dp[left][right] = min;
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}