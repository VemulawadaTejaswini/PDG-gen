import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int d = Integer.parseInt(params[1]);

        int[][] x = new int[n][d];
        for( int i = 0 ; i < n ; i++ ){
            String[] rows = in.nextLine().split(" ");
            for( int j = 0 ; j < d ; j++ ){
                x[i][j] = Integer.parseInt(rows[j]);
            }
        }

        int count = 0;
        for( int nIndex = 0 ; nIndex < n - 1 ; nIndex++ ){
            for( int nIndex2 = nIndex + 1 ; nIndex2 < n ; nIndex2++ ){

                double square = 0;
                for( int j = 0 ; j < d ; j++ ){
                    square += (x[nIndex][j] - x[nIndex2][j])*(x[nIndex][j] - x[nIndex2][j]);
                }
                double result = Math.sqrt(square);

                if( result%1 == 0.0 ){
                    count++;
                }

            }
        }

        System.out.println(count);

        return;

    }
}