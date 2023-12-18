import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str1[] = sc.next().toCharArray();
        char str2[] = sc.next().toCharArray();
        int dp[][] = new int[str1.length+1][str2.length+1];
        for( int i = 1 ; i <= str1.length ; i++ ){
            for( int j = 1 ; j <= str2.length ; j++ ){
                if ( str1[i-1] == str2[j-1] ){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j]  = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
              int i = str1.length , j = str2.length;
        StringBuffer ans = new StringBuffer("");
        while(i>0 && j>0){
            if(dp[i-1][j] == dp[i][j]){
                i--;
                continue;
            } else {
                if(dp[i][j-1] == dp[i][j]){
                    j--;
                    continue;
                }
                if(dp[i][j] == 1+dp[i-1][j-1]){
                    ans.append(str1[i-1]);
                    i--;
                    j--;
                }
            }
        }
        System.out.println(ans.reverse().toString());
    }
}