import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean nail[][] = new boolean[n+1][];
        for (int i = 1; i <= n; i++) {
            nail[i] = new boolean[i+1];
        }
        int ct = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            ct += count(a, b, x, nail);
        }
        System.out.println(ct);
    }

    static int count(int a, int b, int x, boolean[][] nail) {
        int c = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                if (nail[a+i][b+j] == false) {
                    nail[a+i][b+j] = true;
                    c++;
                }
            }
        }
        return c;
    }
}