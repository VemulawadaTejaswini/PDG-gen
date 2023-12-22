import java.util.Scanner;
import java.math.BigInteger;

public class Main {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // Rows of the 1st matrix
        int b = input.nextInt(); // Columns of 1st Matrix and Rows of 2 Matrix
        int c = input.nextInt(); // Columns of 2nd matrix

        BigInteger[][] A = new BigInteger[a][b];
        BigInteger[][] B = new BigInteger[b][c];

        // Build matrix A
        for(int row = 0; row < a; row++){
            for(int col = 0; col < b; col++){
                A[row][col] = BigInteger.valueOf(input.nextInt());
            }
        }

        // Build martix B
        for(int row = 0; row < b; row++){
            for(int col = 0; col < c; col++){
                B[row][col] = BigInteger.valueOf(input.nextInt());
            }
        }

        // Multiple out
        BigInteger[][] result = new BigInteger[a][c];

        for(int row = 0; row < a; row++){
            for(int col = 0; col < c; col++){
                BigInteger temp = sum(A[row], B, col);
                result[row][col] = temp;
            }
        }
        showSheet(result); // Display the result
    }

    // Helper function that computes the value of a cell in the result matrix
    // Takes an (a x 1) vector that is a row of A and then the entire B matrix, and a colIndex that indicates where to index B
    private static BigInteger sum(BigInteger[] row, BigInteger[][] matrix, int colIndex){
        BigInteger total = BigInteger.ZERO;
        for(int i = 0; i < row.length; i++){
            total = total.add(row[i].multiply(matrix[i][colIndex]));
        }
        return total;
    }

    // Helper function that displays a 2D int array
    private static void showSheet(BigInteger[][] result){
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j]);
                if( j < result[0].length - 1) System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
