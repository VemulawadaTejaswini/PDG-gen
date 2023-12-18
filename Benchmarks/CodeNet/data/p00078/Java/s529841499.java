import java.util.*;

class Main {

    static void solve (int n) {
        int [][] square = new int [n][n];
        int x = (n-1)/2;
        int y = (n+1)/2;

        for(int i = 1; i <= n*n; i++) {
            square[y][x] = i;
            y += 1;
            if (y >= n) y = 0;
            x += 1;
            if (x >= n) x = 0;
            if (square[y][x] != 0) {
                x -= 1;
                y += 1;
                if (x == -1)    x = n-1;
                if (y == n)     y = 0;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%4d", square[i][j]);
            }
            System.out.println("");
        }
        
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;

            solve(n);
        }
    }
}