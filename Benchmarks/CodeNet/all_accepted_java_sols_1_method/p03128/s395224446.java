/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numofmatch = {10000000,2,5,5,4,5,6,3,7,6};
        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            ar[i] = sc.nextInt();
        }
        BigInteger[] dp = new BigInteger[n+1];
        // max number made by just n-cost 
        BigInteger test = new BigInteger("-1");
        
        BigInteger shift = BigInteger.TEN;
        for (int i = 0; i <= n; i++) {
            dp[i] = test;
        }
        dp[0] = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i].compareTo(test) == 0) {
                    continue;
                }
                if (i + numofmatch[ar[j]] > n) {
                    continue;
                }else{
                    if (dp[i + numofmatch[ar[j]] ]
                                .compareTo((dp[i].multiply(shift)).add(new BigInteger(Integer.toString(ar[j]))) ) > 0 ) {
                        dp[i + numofmatch[ar[j]]] = dp[i + numofmatch[ar[j]]];
                    } else {
                        dp[i + numofmatch[ar[j]]] = (dp[i].multiply(shift)).add(new BigInteger(Integer.toString(ar[j])));
                    }
                }
            }
        }
        System.out.println(dp[n]);


        sc.close();
    }
}