
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());//int型
        int[] w = new int[n+1];

        w[0] = 0;
        for (int i = 0; i < n; i++) {
            w[i+1] = w[i]+Integer.parseInt(sc.next());
        }
        sc.close();

        int ans = 10000000;
        int r;
        int l;
        for (int i = 1; i < n; i++) {
            r = w[i];
            l = w[n] - w[i];
            ans = Math.min(Math.abs(l-r),ans);
        }

        System.out.println(ans);
    }
}
