import java.util.*;
 
public class Main {
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
 
        int n = s1.length();
        int m = s2.length();
 
        int dp[][] = new int[n+1][m+1];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }

        int len = dp[0][0];
        char ans[] = new char[len];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
                if(s1.charAt(i) == s2.charAt(j)){
                    ans[k++] = s1.charAt(i);
                    i++;
                    j++;
                }
                else{
                    if(dp[i+1][j] > dp[i][j+1]){
                        i++;
                    }
                    else{
                        j++;
                    }
                }
         }

        System.out.print(ans);
        
    }
}