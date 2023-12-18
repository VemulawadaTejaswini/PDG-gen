
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        int q = Integer.parseInt(scan.next());
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        boolean[] mbool = new boolean[q];
        Arrays.fill(mbool, false);

        for (int bit = 0; bit < (1 << n); bit++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += a[i];
                }
            }

            for (int i = 0; i < q; i++) {
                if (sum == m[i]) {
                    mbool[i] = true;
                }
            }
        }

        for (int i = 0; i < q; i++) {
            if (mbool[i]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}

