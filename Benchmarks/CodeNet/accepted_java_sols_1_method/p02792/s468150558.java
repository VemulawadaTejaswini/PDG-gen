import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] dp=new int[10][10];
        for(int k=1;k<=n;k++)
        {
           int j=k%10;
           String s=String.valueOf(k);
           int i=s.charAt(0)-'0';
           dp[i][j]++;
        }
        int res=0;
        for(int i=0;i<=9;i++)
            for(int j=0;j<=9;j++)
            {
                res+=dp[i][j]*dp[j][i];
            }
        System.out.println(res);
    }
}
