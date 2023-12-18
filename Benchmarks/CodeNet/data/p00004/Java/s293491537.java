
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double vector[][] = new double[2][3];
        int i, j;
        while( scan.hasNext() ) {
            for( i = 0; i < 2; i ++ ) {
                for( j = 0; j < 3; j++ ) {
                    vector[i][j] = scan.nextFloat();
                }
            }
            Gaus(vector);
        }
    }
    
    private static void Gaus(double[][] vector) {
        int i;
        double x, y, k;
        
        if( vector[0][0] == 0 ) {
            double[] temp;
            temp = vector[0];
            vector[0] = vector[1];
            vector[1] = temp;
        }
        
        k = vector[1][0] / vector[0][0];
        for( i = 0; i < 3; i++ ) {
            vector[1][i] -= k * vector[0][i];
        }
        y = vector[1][2] / vector[1][1];
        x = (vector[0][2] - vector[0][1] * y) / vector[0][0];
        
        System.out.printf( "%.3f %.3f%n", x, y );
    }
    
}