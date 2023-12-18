
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int T = sc.nextInt();
    static int max = Integer.MAX_VALUE;

    public static void main(String[] args) {
        for (int i = 0; i < T; i++){
//            long dp[] = new long[max];
            Map<Long, Long> dpl = new HashMap<Long, Long>();
            for (int k = 0; k < max; k++){
//                dp[k] = 0;
                dpl.put((long)k, (long)0);

            }
            long N = sc.nextLong();
            long al[] = new long[5];
            for (int j = 0; j < 4; j++){
                al[j] = sc.nextLong();
            }
            al[4] = al[3];
            //初期化
            dpl.put(al[3], (long)1);
//            dp[(int)al[3]] = 1;
            for (int l = (int)al[3]; l < max; l++){
                for (int m = 0; m < 5; m++) {
                    long tmp = 0;
                    if (m == 0)
                        tmp = dpl.get((int)l) * 2;
                    else if (m == 1)
                        tmp = dpl.get((int)l) * 3;
                    else if (m == 2)
                        tmp = dpl.get((int)l) * 5;
                    else if (m == 3) {
                        if (l > 0) {
                            tmp = dpl.get((int)l) - 1;
                        }
                    } else if (m == 4)
                        tmp = dpl.get((int)l) + 1;

                    dpl.put(l + al[m], chmax(tmp, dpl.get(l + al[m])));
//                    dp[l + (int)al[m]] = chmax(tmp, dp[l + (int)al[m]]);
                }
            }
//            System.out.println(dpl.get(N));
            for (int n = 0; n < max; n++){
                if (dpl.get(n) == N){
                    System.out.println(n);
                    return;
                }

            }

        }
    }
    static long chmax(long a, long b){
        if (a > b)
            return a;
        else
            return b;
    }

}
