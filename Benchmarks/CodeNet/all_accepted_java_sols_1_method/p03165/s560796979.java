import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         String s1=s.nextLine(),t1=s.nextLine();
         int n=s1.length(),m=t1.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            char c1=s1.charAt(i-1);
            for(int j=1;j<=m;j++){
                char c2=t1.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
         /*for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
         int i=n,j=m,idx=dp[n][m];
            while(i>0 && j>0) {
                if(s1.charAt(i-1)==t1.charAt(j-1)) {
                    sb.insert(0,s1.charAt(i-1));
                    i--;
                    j--;
                    idx--;
                }
                else {
                    if(dp[i-1][j]>dp[i][j-1]) i--;
                    else j--;
                }
            }
        System.out.println(sb);
        }
    }
