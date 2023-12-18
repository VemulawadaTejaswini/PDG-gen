import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j, tempL, tempR;
        int L = Integer.MIN_VALUE;
        int R = Integer.MAX_VALUE;
        for (i = 0; i < m; i++) {
            tempL = sc.nextInt();
            tempR = sc.nextInt();
            L = Math.max(L, tempL);
            R = Math.min(R, tempR);
        }

        if (L > R) {
            System.out.println(0);
            return;
        } else {
            System.out.println(R - L + 1);
        }

        sc.close();

    }
}
