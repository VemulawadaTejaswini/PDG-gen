import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long[][] bc = new long[m][2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            bc[i][1] = sc.nextInt();
            bc[i][0] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(bc, Comparator.comparingLong((long[] b) -> b[0]).reversed());
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j >= m || a[i] >= bc[j][0]) {
                break;
            }
            a[i] = bc[j][0];
            bc[j][1]--;
            if (bc[j][1] <= 0) {
                j++;
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }

}
