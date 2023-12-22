import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        String a = null, b = null;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextLine();
            b = scanner.nextLine();
        }
        
        int an = a.length();
        int bn = b.length();
        
        int[][] dp = new int[an + 1][bn + 1];
        for(int i = 1; i <= an; i++) {
            for(int j = 1; j <= bn; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if(a.charAt(i - 1) == b.charAt(j -1))
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
            }
        }
        
        // for(int[] d : dp)
        //     System.out.println(Arrays.toString(d));
        
        int i = an;
        int j = bn;
        StringBuilder sb = new StringBuilder();
        while(i >= 1 && j >= 1) {
            int cur = dp[i][j];
            int left = dp[i - 1][j];
            int up = dp[i][j -1];
            
            if(cur > Math.max(left, up)) {
                sb.append(a.charAt(i - 1));
                i--;
                j--;
            } 
            else if (left > up) {
                i--;
            } else {
                j--;
            }
        }
        
        // System.out.println(dp[an][bn]);
        System.out.println(sb.reverse().toString());
        
    }
}