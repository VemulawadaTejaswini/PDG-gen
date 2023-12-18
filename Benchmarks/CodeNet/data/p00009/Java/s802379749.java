import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final int[] pc = createPrimeChecker();
    private static final int MAX = 1000000;
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            System.out.println(pc[scn.nextInt()]);
        }
    }
    
    private static int[] createPrimeChecker() {
        int[] ary = new int[MAX];
        ary[2] = 1;
        for(int i = 3; i < MAX; i += 2) {
            ary[i] = 1;
        }
        int lim = (int)Math.sqrt(MAX) + 1;
        for(int i = 3; i < lim; i += 2) {
            if(ary[i] > 0) {
                for(int j = i * 2; j < MAX; j += i) {
                    ary[j] = 0;
                }
            }
        }
        for(int i = 3, j = 1; i < MAX; i++) {
            if(ary[i] > 0) {
                ary[i] += j;
                j++;
            } else {
                ary[i] += j;
            }
        }
        return ary;
    }
}