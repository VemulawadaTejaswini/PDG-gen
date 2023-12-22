import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        String s=new String();
        String t=new String();
        StringBuilder res=new StringBuilder();
        Scanner in=new Scanner(System.in);
        s=in.next();
        t=in.next();
        int m=s.length(),n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        while(dp[m][n]>0){
            if(s.charAt(m-1)==t.charAt(n-1)){
                res.append(s.charAt(m-1));
                m--;
                n--;
            }
            else{
                if(dp[m][n]==dp[m-1][n])m--;
                else n--;
            }
        }
        System.out.println(res.reverse().toString());
    }
}
