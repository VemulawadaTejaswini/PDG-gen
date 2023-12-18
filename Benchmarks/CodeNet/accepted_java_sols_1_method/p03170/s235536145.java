import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       int n=s.nextInt(),k=s.nextInt();
       //boolean[][] dp=new boolean[n+1][k+1];
       int[] arr=new int[n+1];
       for(int i=1;i<=n;i++){
        arr[i]=s.nextInt();
       }
       boolean[] b=new boolean[k+1];
       /*for(int i=1;i<=n;i++){
        for(int j=1;j<=k;j++){
          if(arr[i]>j){
            dp[i][j]=dp[i-1][j];
          }
          else{
            dp[i][j]=dp[i-1][j]||(!dp[i][j-arr[i]]);
          }
        }
       }*/
       for(int i=0;i<=k;i++){
        if(!b[i]){
          for(int j=1;j<=n;j++){
            if(i+arr[j]<=k){b[i+arr[j]]=true;}
          }
        }
       }

       if(b[k]){
        System.out.println("First");
       }
       else{System.out.println("Second");}
        }
    }
