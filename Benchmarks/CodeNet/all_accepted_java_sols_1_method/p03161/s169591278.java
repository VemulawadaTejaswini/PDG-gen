import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] H = new int[N];
        int [] DP = new int[N];
        for(int i=0;i<N;i++){
            H[i] = sc.nextInt();
            DP[i]=999999999;
        }
        DP[0]=0;
        for(int i=1;i<N;i++){
            int num;
            if(i+1-K<=0) num = 0;
            else num = i-K;
            for(int j=i-1;j>=num;j--) {
                int now = Math.abs(H[i] - H[j]);
                if (now + DP[j] < DP[i]) DP[i] = DP[j] + now;
            }
        }
        System.out.println(DP[N-1]);
    }
}