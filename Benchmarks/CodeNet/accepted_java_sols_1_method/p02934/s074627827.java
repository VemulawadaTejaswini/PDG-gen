import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] A = new double[N];
        for(int i = 0; i < N; i++){
            A[i]  = sc.nextInt();
        }
        sc.close();
        double sum = 1;
        for(int i = 0; i < N; i++)
            sum *= A[i];
        double[] dp = new double[N];
        for(int i = 0; i < N; i++){
            dp[i] = sum / A[i];
        }
        double sum_dp = 0;
        for(int i = 0; i < N; i++){
            sum_dp += dp[i];
        }
        System.out.println(sum/ sum_dp);
    }
}