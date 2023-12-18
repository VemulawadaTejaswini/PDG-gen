import java.util.Scanner;

public class Main {

    private static int n;
    private static int[] a;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) m[i] = sc.nextInt();

        for (int i = 0; i < q; i++) {
            if (solve(0, m[i]))
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }

    private static boolean solve(int i, int m) {
        if (m == 0) return true;
        if (i >= n) return false;
        return solve(i + 1, m) || solve(i + 1, m - a[i]);
    }
}

