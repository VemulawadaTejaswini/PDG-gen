import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ans = 0;
        int n = scanner.nextInt();
        int[][] f = new int[20][20];
        for (int i = 0; i < n; i++) {
            double v = scanner.nextDouble();
            long vv = (long) (v * 1000000000);
            int p = 0, q = 0;
            while (vv % 2 == 0) {
                p++;
                vv = vv / 2;
            }
            while (vv % 5 == 0) {
                q++;
                vv = vv / 5;
            }
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