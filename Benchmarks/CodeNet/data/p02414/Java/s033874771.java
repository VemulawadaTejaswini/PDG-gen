import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cij = (k=1...m) AikBkj
        // Cnl = Anm x Bml
        
        // input n,m,l
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        
        // create Anm
        int[][] Anm = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Anm[i][j] = scanner.nextInt();
            }
        }
        
        // create Bml
        int[][] Bml = new int[m][l];
        for(int i=0; i<m; i++){
            for(int j=0; j<l; j++){
                Bml[i][j] = scanner.nextInt();
            }
        }
        
        // create Cnl
        long[][] Cnl = new long[n][l];
        for(int iN=0; iN<n; iN++){
            for(int kM=0; kM<m; kM++){            
                for(int jL=0; jL<l; jL++){
                    Cnl[iN][jL] += Anm[iN][kM] * Bml[kM][jL];
                }
            }
        }
        
        // display
        printArray(Cnl);

    }
    
    public static void printArray(long[][] array) {
        int row = array.length;
        int width = array[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<width; j++){
                System.out.print(array[i][j]);
                if (j != width-1) { System.out.print(" "); }
            }
            System.out.println();
        }
    }
    
}
