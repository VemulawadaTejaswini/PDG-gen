import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }
        boolean[] c = new boolean[40001];
        c[0] = true;
        for (int i = 0; i < 1<<n; i++) {
            int t = 0;
            for (int j = 0; j < n; j++) {
                if((i>>j & 1) != 1)continue;
                t += a[j];
            }
            c[t] = true;
        }
        for (int i = 0; i < q; i++) {
            System.out.println(c[b[i]] ? "yes" : "no");
        }
        sc.close();

    }

}

