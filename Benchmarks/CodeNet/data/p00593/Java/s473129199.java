import java.util.*;

class Main {

    static void solve (int n) {
        int[][] jpeg = new int [n][n];
        int x = 0;
        int y = 0;
        boolean ascending = true;

        for (int i = 1; i <= n * n; i++) {
            jpeg[x][y] = i;
            if ( ascending && y == 0 && x != n-1 )  {
                x += 1;
                ascending = false;
            } else if ( (!ascending) && x == 0 && y != n-1) {
                y += 1;
                ascending = true;
            } else if ( ascending && x == n-1) {
                y += 1;
                ascending = false;
            } else if ( (!ascending) && y == n-1) {
                x += 1;
                ascending = true;
            } else if (ascending) {
                x += 1;
                y -= 1;
            } else {
                x -= 1;
                y += 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", jpeg[j][i]);
            }
            System.out.println("");
        }
    }


    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int times = 1;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            System.out.printf("Case %d:\n", times);
            solve(n);
            times += 1;
        }

    }
}