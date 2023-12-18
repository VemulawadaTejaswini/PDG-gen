import java.util.*;

public class Main {
    public static final int MAX = 1_000_000;

    public static void main(String[] args) {
        boolean[] prime = createPrimeTable(MAX);
        try(Scanner scn = new Scanner(System.in)) {
            int a;
            int b;
            int n;
            while((a = scn.nextInt()) > 0 | (b = scn.nextInt()) > 0 | (n = scn.nextInt()) > 0) {
                for(int cnt = 0; cnt < n; a += b) {
                    if(prime[a]) {
                        cnt++;
                    }
                }
                System.out.println(a - b);
            }
        }
    }

    public static boolean[] createPrimeTable(int num) {
        boolean[] rslt = new boolean[-~num];
        int lmt = (int)Math.ceil(Math.sqrt(num));
        Arrays.fill(rslt, 2, rslt.length, true);
        for(int i = 4; i <= num; i += 2) {
            rslt[i] = false;
        }
        for(int i = 3; i <= lmt; i += 2) {
            for(int j = i * 2; j <= num; j += i) {
                rslt[j] = false;
            }
        }
        return rslt;
    }
}