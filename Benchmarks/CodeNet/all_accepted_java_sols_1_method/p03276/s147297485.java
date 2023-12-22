import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] r = new int[N+1];
        int[] l = new int[N+1];
        int pr = 1;
        int pl = 1;
        
        for (int i = 0; i < N; i++) {
            int in = sc.nextInt();
            if (in < 0) {
                l[pl] = -in;
                pl++;
            } else if (in > 0) {
                r[pr] = in;
                pr++;
            } else {
                // in == 0
                K--;
            }
        }
        Arrays.sort(l, 0, pl);
        
        long min = Integer.MAX_VALUE;
        
        for (int i_r = K; i_r >= 0; i_r--) {
            int i_l = K - i_r;
            
            if (i_r >= pr || i_l >= pl) continue;
            int cand1 = r[i_r]     + l[i_l] * 2;
            int cand2 = r[i_r] * 2 + l[i_l];
            min = Math.min(Math.min(min, cand1), cand2);
        }
        so.println(min);
    }
}
