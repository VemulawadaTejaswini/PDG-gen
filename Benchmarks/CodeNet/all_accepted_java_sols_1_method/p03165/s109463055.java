import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[tLength+1][sLength+1];
        for(int i = 1 ; i<=tLength ; ++i){
            for(int j = 1 ; j<=sLength ; ++j){
                if(s.charAt(j-1)==t.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int itr =dp[tLength][sLength];
        char[] res = new char[itr];
        for(int i =tLength , j = sLength ; i> 0&&j>0 ; ){
            if(s.charAt(j-1)==t.charAt(i-1)){
                res[--itr] = s.charAt(j-1);
                --j;--i;
            }else  if(dp[i][j-1]>dp[i-1][j]){
                --j;
            }else{
                --i;
            }
        }
        System.out.println(new String(res));
    }
}
