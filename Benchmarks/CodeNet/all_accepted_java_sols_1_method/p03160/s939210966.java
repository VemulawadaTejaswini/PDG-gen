import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        int[] dp = new int[n];
        dp[0] = 0;
        if(ary[0] > ary[1]) dp[1] = ary[0] - ary[1];
        else    dp[1] = ary[1] - ary[0];
        for(int i = 2; i < n; i++){
            int a;
            int b;
            if(ary[i] > ary[i - 2]) a = ary[i] - ary[i - 2];
            else    a = ary[i - 2] - ary[i];
            if(ary[i] > ary[i - 1]) b = ary[i] - ary[i - 1];
            else    b = ary[i - 1] - ary[i];
            dp[i] = Math.min(dp[i - 2] + a, dp[i - 1] + b);
        }
        System.out.println(dp[n - 1]);
    }
}