import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        int P = sc.nextInt();
        int sum=0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            sum+=A[i];
        }
        long [] dp = new long [sum+1];
        dp[0] = 1;
        for(int i=0; i<N; i++){
            for(int j=sum; j>=0; j--){
                if(dp[j]!=0)dp[j+A[i]]+=dp[j];
            }
        }
        long ans=0;
        for(int j=P; j<=sum; j+=2){
            ans+=dp[j];
        }
        System.out.println(ans);
    }
}