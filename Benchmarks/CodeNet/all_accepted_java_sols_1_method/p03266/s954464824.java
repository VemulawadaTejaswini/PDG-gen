import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ss = new int[k];

        for (int i = 1; i <= n; i++)
            ss[i % k]++;
        long res = 0;
        for (int a = 0; a < k; ++a) {
            int b = (k - a) % k;
            int c = (k - a) % k;
            if ((b + c) % k != 0)
                continue;
            res += (long) ss[a] * ss[b] * ss[c];
        }
        System.out.println(res);
    }

}
