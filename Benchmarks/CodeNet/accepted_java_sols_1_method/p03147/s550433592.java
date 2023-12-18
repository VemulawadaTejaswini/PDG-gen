import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int mm = 0;
            int idx = 0;
            for (int j = 0; j < n; j++) {
                if ((mm > a[j] || mm == 0) && a[j] != 0) {
                    mm = a[j];
                    idx = j;
                }

            }
            if (mm == 0)
                break;

            ans += mm;

            int idl = 0;
            int idr = 0;
            for (int j = idx; j >= 0; j--) {
                if (a[j] == 0) {
                    idl = j;
                    break;
                }
                if (j == 0) {
                    idl = -1;
                    break;
                }
            }
            for (int j = idx; j < n; j++) {
                if (a[j] == 0) {
                    idr = j;
                    break;
                }
                if (j == n - 1) {
                    idr = n;
                    break;
                }
            }

            for (int j = idx; j < idr; j++) {
                a[j] -= mm;
            }
            for (int j = idx - 1; j > idl; j--) {
                a[j] -= mm;
            }

        }

        System.out.println(ans);
    }

}
