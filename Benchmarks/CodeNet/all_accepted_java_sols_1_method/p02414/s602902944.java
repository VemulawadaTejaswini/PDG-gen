import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int a[][] = new int [n][m];
        int b[][] = new int [m][l];
        long  c[][] = new long[n][l];
        
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(j = 0; j < m; j++){
            for(k = 0; k < l; k++){
                b[j][k] = sc.nextInt();
            }
        }
        
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                for(k = 0; k < l; k++){
                    c[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        for(i = 0; i < n; i++){
            for(k = 0; k < l; k++){
                System.out.printf("%d", c[i][k]);
                if(k == l - 1) break;
                System.out.printf(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

