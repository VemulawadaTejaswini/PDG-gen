import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        boolean flag = true;
        for(int i=0;i<n;i++) flag &= (a[i]%2==0);
        String ans = flag?"second":"first";
        System.out.println(ans);
        /*Arrays.sort(a,Collections.reverseOrder());
        int[] dp = new int[n];
        if(n==1){
          String ans = a[0]%2==0?"second":"first";
          System.out.println(ans);
          System.exit(0);
        }
        Arrays.fill(dp,-1);
        // dp[i]=0 means first wins. =1 means second wins
        if(a[0]%2==0&&a[1]%2==0) dp[1]=1;
        else dp[1]=0;
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();*/
    }
}
