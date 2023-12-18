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
            suma[1] = sum;
            if(ans < sum) ans = sum;
            while(i != nex && len < K){
                nex = P[nex];
                sum += C[nex];
                len++;
                suma[len] = sum;
                if(ans < sum) ans = sum;
            }
            if(0 < sum && len < K){
                long sho = K / len;
                long r = K % len;
                long max = 0L;
                for (int j = 1; j <= r; j++) {
                    max = Math.max(max, suma[j]);
                }
                max = sum * sho + max;
                ans = Math.max(ans, max);
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
