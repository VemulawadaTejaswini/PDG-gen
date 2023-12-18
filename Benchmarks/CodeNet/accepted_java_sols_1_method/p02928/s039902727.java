import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        long P = 1000000007;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextInt();
        long [] A = new long[N];
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i =0;i<N;i++){
            for (int j=i+1;j<N;j++){
                if (A[i] > A[j]){
                    ans += (K+1)*K / 2;
                    ans%=P;
                }
                if (A[i] < A[j]){
                    ans += (K-1)*K / 2;
                    ans%=P;
                }
            }
        }
        System.out.printf("%d\n",ans);
    }
}
