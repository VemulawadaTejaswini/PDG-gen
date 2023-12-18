
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] xm = new int[n];
        int[] ym = new int[m];
        for (int i = 0; i < n; i++) {
            xm[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ym[i] = sc.nextInt();
        }
        boolean ok = false;
        IN: for (int z = x + 1; z <= y; z++) {
            for (int i = 0; i < n; i++) {
                if (xm[i] >= z)
                    continue IN;
            }
            for (int i = 0; i < m; i++) {
                if (ym[i] < z)
                    continue IN;
            }
            ok = true;
        }

        System.out.println(ok ? "No War" : "War");

    }

}
