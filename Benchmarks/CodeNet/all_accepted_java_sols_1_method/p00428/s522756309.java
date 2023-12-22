import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int m = sc.nextInt(), n = sc.nextInt();
            if ((m | n) == 0) {
                break;
            }
            Integer[] r = new Integer[n];
            Arrays.fill(r, 0);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    r[j] += sc.nextInt();
            }
            Integer[] t = r.clone();
            int[] a = new int[n];
            Arrays.sort(r, Comparator.reverseOrder());
            for (int i = 0; i < n;i++) {
                for (int j = 0; j < n; j++) {
                    if (r[i] == t[j] && t[j] >= 0) {
                        a[i] = j + 1;
                        t[j]=-1;
                        break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i < n - 1 ? " " : "\n"));
            }
        }
    }
}
