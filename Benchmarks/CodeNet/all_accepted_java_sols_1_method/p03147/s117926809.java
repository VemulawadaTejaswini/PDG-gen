import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i=0; i<n; i++) {
            h[i] = sc.nextInt();
        }

        int numWaterings = 0;
        boolean nonZeroTreeFound = true;
        while (nonZeroTreeFound) {
        	nonZeroTreeFound = false;
            boolean oldBunchOfTreesEnded = false;
            for (int i=0; i<n; i++) {
            	if (h[i] > 0) {
                	nonZeroTreeFound = true;
                    h[i]--;
                    oldBunchOfTreesEnded = false;
                } else {
                	if (nonZeroTreeFound && !oldBunchOfTreesEnded) {
                      oldBunchOfTreesEnded = true;
                      numWaterings++;
                    }
                }
            }
            if (nonZeroTreeFound && !oldBunchOfTreesEnded) {
            	numWaterings++;
            }
        }
        System.out.println(numWaterings);
    }
}
