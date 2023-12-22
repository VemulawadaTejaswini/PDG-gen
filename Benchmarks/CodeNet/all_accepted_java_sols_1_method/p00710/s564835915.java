import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, r, p, c;
        while (true) {
            n = sc.nextInt();
            r = sc.nextInt();

            if (n == 0 && r == 0) break;

            int[] a = new int[n], tmp = new int[n];

            for (int i=0; i<n; i++) a[i] = n - i;
            for (int i=0; i<r; i++) {
                System.arraycopy(a, 0, tmp, 0, n);

                p = sc.nextInt();
                c = sc.nextInt();
                System.arraycopy(Arrays.copyOfRange(a, p-1, p-1+c), 0, tmp, 0, c);
                System.arraycopy(Arrays.copyOfRange(a, 0, p), 0, tmp, c, p-1);

                System.arraycopy(tmp, 0, a, 0, n);
            }
            System.out.println(a[0]);
        }
    }
}