import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] p = new boolean[n];
        for (int i=0; i<n; i++) {
            int ai = sc.nextInt();
            a[i] = ai;
            boolean pi = true;
            for (int j=0; j<i; j++) {
                if (pi) {
                    if (ai % a[j] == 0) {
                        pi = false;
                    }
                }
                if (p[j]) {
                    if (a[j] % ai == 0) {
                        p[j] = false;
                    }
                }
            }
            p[i] = pi;
        }
        int count = 0;
        for (boolean pi : p) {
            if (pi) {
                count++;
            }
        }
        System.out.println(count);
    }
}