
import java.util.*;

/**
 * A
 */
public class Main {

    int n;
    int[] A;
    boolean res;

    void run() {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        A = new int[n];

        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] M = new int[q];

        for (int i = 0; i < q; i++) {
            M[i] = sc.nextInt();
        }

        sc.close();

        for(int i=0; i<q; i++) {
            
            boolean ans = solve(0, M[i]);
            
            if(ans) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
    
    boolean solve(int i, int m) {

        if (m == 0) {
            return true;
        }
        if (i >= n) {
            return false;
        }

        res = solve(i + 1, m) || solve(i + 1, m - A[i]);

        return res;
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
