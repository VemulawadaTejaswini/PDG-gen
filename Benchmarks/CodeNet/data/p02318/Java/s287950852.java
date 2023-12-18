import java.util.*;

public class Main{
    static int min(int a, int b, int c){
        if(a<b && a<c)
            return a;
        else if(b<c)
            return b;
        else
            return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] dp = new int[l1+1][l2+1];

        //initialize
        for(int i1=0; i1<=l1; i1++){
            dp[i1][0] = i1;
        }
        for(int i2=0; i2<=l2; i2++){
            dp[0][i2] = i2;
        }

        for(int i1=1; i1<=l1; i1++){
            for(int i2=1; i2<=l2; i2++){
                int cost = (s1.charAt(i1-1) == s2.charAt(i2-1)) ? 0 : 1;
                dp[i1][i2] = min(dp[i1-1][i2-1]+cost, dp[i1-1][i2]+1, dp[i1][i2-1]+1);
            }
        }
        System.out.println(dp[l1][l2]);
    }
}

