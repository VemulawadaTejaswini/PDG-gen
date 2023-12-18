import java.util.*;

class Main {

    static int n;
    static char [][] field;
    static int [][] greatestSize;

    static int greatest(int x, int y, int size) {
        if (x + size >= n || y + size >= n) return size;
        
        for (int i = 0; i <= size; i++) {
            if (field[x + size][y + i] == '*')  return size;
            if (field[x + i][y + size] == '*')  return size;
        } 

        return greatest(x, y, size + 1);
    }

    static void solve () {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == '.' && greatestSize[i][j] == 0) {
                    int g = greatest(i, j, 1);
                    for (int k = 0; k < g; k++) {
                        greatestSize[i+k][j+k] = g-k;
                    }
                }
                // if (j >= n - result) break;
            }
            // if (i >= n - result) break;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, greatestSize[i][j]);
            }
        }

        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            n = sc.nextInt();

            if (n == 0) break;

            field = new char[n][n];
            greatestSize = new int [n][n];
            for (int i = 0; i < n; i++) {
                field[i] = sc.next().toCharArray();
                for(int j = 0; j < n; j++) {
                    greatestSize[i][j] = 0;
                }
            }
            
            solve();
        }

    }
}