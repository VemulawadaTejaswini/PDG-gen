import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int q = Integer.parseInt(sc.next());
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = Integer.parseInt(sc.next());
        }

        int[] num = new int[1 << n];

        for (int i = 0; i < (1 << n); i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    s += a[j];
                }
            }
            num[i] = s;
        }
        Arrays.sort(num);

        for (int i = 0; i < q; i++) {
            boolean fl = false;
            for (int j = 0; j < (1 << n); j++) {
                if (m[i] == num[j]) {
                    fl = true;
                } else if (m[i] < num[j]) {
                    break;
                }
            }
            System.out.println(fl ? "yes" : "no");
        }

        sc.close();
    }
}
