import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.next());
        final int m = Integer.parseInt(sc.next());

        final int[] s = new int[m];
        final int[] c = new int[m];
        final boolean[] flag = new boolean[3];
        final int[] ans = new int[3];
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(sc.next()) - 1;
            c[i] = Integer.parseInt(sc.next());
            if (flag[s[i]] == false) {
                flag[s[i]] = true;
                ans[s[i]] = c[i];
            } else {
                if (ans[s[i]] != c[i]) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        if (n == 3) {
            if (flag[0] == false) {
                ans[0] = 1;
            } else if (ans[0] == 0) {
                System.out.println(-1);
                System.exit(0);
            }
            System.out.print(ans[0]);
            System.out.print(ans[1]);
            System.out.println(ans[2]);
        } else if (n == 2) {
            if (flag[0] == false) {
                ans[0] = 1;
            } else if (ans[0] == 0) {
                System.out.println(-1);
                System.exit(0);
            }
            System.out.print(ans[0]);
            System.out.println(ans[1]);
        } else {
            System.out.println(ans[0]);
        }

        sc.close();
    }
}