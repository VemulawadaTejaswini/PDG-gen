import java.util.*;

public class Main {

    static int N;
    static int K;
    static int[] P;
    static long[] C;
    static boolean[] used;
    static long ans = Long.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        P = new int[N];
        C = new long[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt()-1;
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            long[] suma = new long[N+1];
            int len = 1;
            int nex = P[i];
            long sum = C[nex];
            if(ans < sum) ans = sum;
            suma[1] = sum;
            int maxidx = 1;
            long maxsum = Math.max(0, sum);
            while(i != nex && len < K){
                nex = P[nex];
                sum += C[nex];
                len++;
                if(ans < sum) ans = sum;
                suma[len] = sum;
                if(maxsum < sum){
                    maxsum = sum;
                    maxidx = len;
                }
            }
            if(0 < sum && len < K){
                long sho = K / len;
                long r = K % len;
                for (int j = 1; j <= r; j++) {
                    ans = Math.max(ans, sum * sho + suma[j]);
                }
                if(r < maxidx){
                    ans = Math.max(ans, sum * (sho-1) + maxsum);
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
