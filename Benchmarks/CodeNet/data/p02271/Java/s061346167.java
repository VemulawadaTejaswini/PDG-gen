import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int q = in.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = in.nextInt();
        }

        for (int mi : m) {
            if (solve(0, mi, a)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean solve(int p, int mi, int[] a) {
        if (mi == 0) {
            return true;
        }

        if (p == a.length || mi < 0) {
            return false;
        }

        return solve(p+1, mi, a) || solve(p+1, mi-a[p], a);
    }
}

