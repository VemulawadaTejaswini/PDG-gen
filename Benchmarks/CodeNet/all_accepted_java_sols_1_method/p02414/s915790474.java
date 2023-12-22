import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = line.split(" ");
        int n = Integer.parseInt(linesp[0]);
        int m = Integer.parseInt(linesp[1]);
        int l = Integer.parseInt(linesp[2]);
        long[][] A = new long[n][m];
        long[][] B = new long[m][l];
        long[][] C = new long[n][l];
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String[] line1sp = line1.split(" ");
            for(int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line1sp[j]);
            }
        }
        
        for(int i = 0; i < m; i++) {
            String line2 = sc.nextLine();
            String[] line2sp = line2.split(" ");
            for(int j = 0; j < l; j++) {
                B[i][j] = Integer.parseInt(line2sp[j]);
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                long sum = 0;
                for(int k = 0; k < m; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                System.out.print(C[i][j]);
                if(j != l - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
  }
 }
