import java.util.Scanner;

public class Main {
    static int R = (int) 1e5 + 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[R];
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            ++m[x];
            if (x < R - 1) ++m[x + 1];
            if (x > 0) ++m[x - 1];
        }
        int res = 0;
        for (int v : m) res = Math.max(res, v);
        System.out.println(res);
    }
}