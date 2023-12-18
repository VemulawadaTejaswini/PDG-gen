import java.util.*;
public class Main {
    static int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        for(int i=0;i<N;i++)A[i]=sc.nextLong();
        sc.close();

        long ans = 0;
        for(int i=0;i<61;i++) {
            int cnt = 0;
            for(int j=0;j<N;j++) {
                if(((A[j]>>i)&1)==1) cnt++;
            }
            ans += (long)cnt * (((long)(N-cnt) * (((long)1<<i)%mod))%mod);
            ans %= mod;
//            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
