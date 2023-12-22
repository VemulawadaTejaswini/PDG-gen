import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        long dp[][] = new long[num1+1][num2+1];
        Arrays.fill(dp[0],0);

        long value[] = new long[num1];
        int weight[] = new int[num1];
                
        for(int i=0; i<num1; i++){
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }
        for(int i=1; i<num1+1; i++){
            for(int j=0; j<num2+1; j++){
                if(weight[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], value[i-1] + dp[i-1][j - weight[i-1]]);
                }
            }
        }

        System.out.println(dp[num1][num2]);
        

    }
}