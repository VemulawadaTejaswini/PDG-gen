import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt(),k=s.nextInt();
       boolean[][] dp=new boolean[k+1][n+1];
       int[] arr=new int[n+1];
       for(int i=1;i<=n;i++){arr[i]=s.nextInt();}
       for(int i=1;i<=k;i++){
       	for(int j=1;j<=n;j++){
       		dp[i][j]=i<arr[j]?dp[i][j-1]:(dp[i][j-1]||!dp[i-arr[j]][n]);
       	}
       }
       if(dp[k][n]){out.write("First\n");}
       else{out.write("Second\n");}
        
        out.flush();
  }
}
