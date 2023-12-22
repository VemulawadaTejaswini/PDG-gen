import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n;
            int[] p;
            n = Integer.parseInt(sc.next());
            p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(sc.next());
            }
            Arrays.sort(p);
            int pp = 0;
            for (int i = n; i > 0; i--) {
                pp += p[n - i] * i;
            }
            System.out.println(pp);
        }
    }
}

