import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n, m, l;

        n = scanner.nextInt();
        m = scanner.nextInt();
        l = scanner.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];

        //create A matrix
        for(int arow = 0; arow < n; arow++){
            for(int acol = 0; acol < m; acol++){
                a[arow][acol] = scanner.nextInt();
            }
        }

        //create B matrix
        for(int brow = 0; brow < m; brow++){
            for(int bcol = 0; bcol < l; bcol++){
                b[brow][bcol] = scanner.nextInt();
            }
        }

        for(int ccol = 0; ccol < l; ccol++){
            for(int arow = 0; arow < n; arow++){

                for(int acol = 0; acol < m; acol++){
                    c[arow][ccol] += (long)a[arow][acol] * (long)b[acol][ccol];
                }
            }
        }


        for(int row = 0; row < n; row++){
            for(int col = 0; col < l-1; col++){
                System.out.print(c[row][col] + " ");
            }
            System.out.println(c[row][l-1]);
        }

        scanner.close();
    }
}

