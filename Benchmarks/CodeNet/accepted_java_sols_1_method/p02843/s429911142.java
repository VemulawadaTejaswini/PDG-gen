import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      int[][] dp=new int[6][n+1];
      for(int i=0;i<=n;i++){
      	if(i%100==0){dp[0][i]=1;}
      }
      for(int i=0;i<6;i++){
      	dp[i][0]=1;
      }
      for(int i=1;i<6;i++){
      	for(int j=1;j<=n;j++){
      		if(j<100+i){
      			dp[i][j]=dp[i-1][j];
      		}
      		else{
      			dp[i][j]=dp[i-1][j]+dp[i][j-100-i];
      		}
      	}
      }
      if(dp[5][n]==0){
      	System.out.println("0");
      }
      else{System.out.println("1");}
        }
    }
