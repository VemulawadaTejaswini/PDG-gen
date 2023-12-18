import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int K;
        int MOD_VAL = 1_000_000_007;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
        }
        long[] mae = new long[N+1];
        long[] ushi = new long[N+1];

        mae[0] = 0;
        for (int i = 1; i < N+1; i++) {
            mae[i] = (mae[i -1]% MOD_VAL + i% MOD_VAL) % MOD_VAL;
        }

        ushi[N] = N;
        for (int i = N-1; i >= 0; i--) {
            ushi[i] = (ushi[i+1]% MOD_VAL + i% MOD_VAL) % MOD_VAL;

        }
        //System.out.println(Arrays.toString(mae));
        //System.out.println(Arrays.toString(ushi));
        long result = 0;
        for (int i = K; i <= N + 1; i++) {
            long temp = ushi[(N+1) -i]% MOD_VAL - (long)(mae[i -1]% MOD_VAL -1);
            if(temp < 0){
                temp = (MOD_VAL + temp) % MOD_VAL;
            }
            temp = temp% MOD_VAL;
            //System.out.println(temp);
            result += temp;
            result = result % MOD_VAL;
        }
        System.out.println(result);
    }

}
