import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();

        int[][] arr=new int[n][3],dp=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++) {
                if (scan.hasNext())
                    arr[i][j] = scan.nextInt();
                if(i==0){
                    dp[i][j]=arr[i][j];
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++) {
                int max = Integer.MIN_VALUE;
                for(int k=0;k<3;k++){
                    if(k==j){
                        continue;
                    }
                    max=Math.max(dp[i-1][k],max);
                }
                dp[i][j]=arr[i][j]+max;
            }
        }
        System.out.println(Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2])));


    }
}
