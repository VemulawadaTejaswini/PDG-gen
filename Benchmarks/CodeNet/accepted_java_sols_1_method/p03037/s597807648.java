import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int ll = 0;
            int rr = n;
            for (int i = 0; i < m; i++) {
                int li = sc.nextInt();
                int ri = sc.nextInt();
                if (li > ll) {
                    ll = li;
                }
                if (ri < rr) {
                    rr = ri;
                }
            }
            int ans = rr - ll + 1;
            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}