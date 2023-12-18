import java.util.*;

class Main {

    static int[][] table;
    static int n;

    static void solve (  ) {

        for(int i = 0; i < n; i++) {
            table[i][n] = 0;
            for(int j = 0; j < n; j++) {
                table[i][n] += table[i][j];
            }
        }
        for(int j = 0; j <= n; j++) {
            table[n][j] = 0;
            for(int i = 0; i < n; i++) {
                table[n][j] += table[i][j];
            }
        }

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.printf("%5d", table[i][j]);
           }
           System.out.println("");
        }

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();
            if (n==0)   break;

            table = new int [n+1][n+1];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    table[i][j] = sc.nextInt();
                }
            }

            solve();

        }

    }
}