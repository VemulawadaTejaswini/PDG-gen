import java.util.Scanner;

/**
 * Created by Harry on 4/1/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_f
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        char[] res = new char[dp[n][m]];
        int index = dp[n][m]-1;
        int i = n;
        int j = m;
        while(i>0 && j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                res[index--] = s.charAt(i-1);
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.print(new String(res));
    }
}
