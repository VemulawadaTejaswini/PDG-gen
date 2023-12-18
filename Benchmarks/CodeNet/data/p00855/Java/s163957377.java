import java.util.*;

public class Main {
    private static final int MAX = 1_299_710;
    private static final boolean[] PRIME;

    static {
        boolean[] ary = new boolean[MAX];
        Arrays.fill(ary, 2, ary.length, true);
        for(int i = 4; i < MAX; i += 2) {
            ary[i] = false;
        }
        int lmt = (int)Math.ceil(Math.sqrt(MAX));
        for(int i = 3; i < lmt; i += 2) {
            if(ary[i]) {
                for(int j = i * 2; j < MAX; j += i) {
                    ary[j] = false;
                }
            }
        }
        PRIME = ary;
    }

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num;
            while((num = scn.nextInt()) > 1) {
                System.out.println(PRIME[num] ? 0 : countGap(num));
            }
        }
    }

    private static int countGap(int num) {
        int rslt = 0;
        for(int i = num; !PRIME[i]; i++) {
            rslt++;
        }
        for(int i = num; !PRIME[i]; i--) {
            rslt++;
        }
        return rslt;
    }
}