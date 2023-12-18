import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // r...row count,  c...column count
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        
        // r(y) x c(x) matrix
        int[][] rcmatrix = new int[r+1][c+1];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                rcmatrix[i][j] = scanner.nextInt();
            }
            
            int c1 = 0;
            for(int k=0; k<c; k++){
                c1 += rcmatrix[i][k];
            }
            rcmatrix[i][c] = c1;
        }
        
        
        for(int i=0; i<c+1; i++){
            int r1 = 0;
            for(int j=0; j<r; j++){
                r1 += rcmatrix[j][i];
            }
            rcmatrix[r][i] = r1;
        }
        
        // display
        for(int i=0; i<r+1; i++) {
            for(int j=0; j<c+1; j++){
                System.out.print(rcmatrix[i][j]);
                if (j != c) { System.out.print(" "); }
            }
            // if (i != r) { System.out.println(); }
            System.out.println();
        }
        
        
    }
}
