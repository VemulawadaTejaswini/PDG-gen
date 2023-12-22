import java.util.*;

public class Main{

    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        dp = new int[3];
        
        dp[0] = (cs[0]=='R'?1:0);

        for(int i=1;i<3;i++){
            dp[i] = cs[i]=='R'?(dp[i-1]+1):0;
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

        sc.close();
    }


}