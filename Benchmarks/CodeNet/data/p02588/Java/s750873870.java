
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ans = 0;
        int n = scanner.nextInt();
        int[][] f = new int[20][20];
        for (int i = 0; i < n; i++) {
            StringBuilder v = new StringBuilder(scanner.next());
            if (!v.toString().contains(".")) {
                v.append(".");
            }
//            System.out.println(v.lastIndexOf("."));
            for (int j = v.length() - v.lastIndexOf("."); j <= 9; j++) {
                v.append("0");
            }
            long vv = Long.valueOf(v.toString().replace(".", ""));
            int p = 0, q = 0;
            while (vv % 2 == 0) {
                p++;
                vv = vv / 2;
            }
            while (vv % 5 == 0) {
                q++;
                vv = vv / 5;
            }
            p = Math.min(18, p);
            q = Math.min(18, q);
            for (int j = 18 - p; j <= 18; j++) {
                for (int k = 18 - q; k <= 18; k++) {
                    ans = ans + f[j][k];
                }
            }
            f[p][q]++;
        }
        System.out.println(ans);
    }
}