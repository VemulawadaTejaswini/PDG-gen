import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i, j;
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        int m = sa.nextInt();
        int a[][] = new int [n][m];
        int b[] = new int [m];
        int c[] = new int [n];
        
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                a[i][j] = sa.nextInt();
            }
        }
        for(i = 0; i < m; i++){
            b[i] = sa.nextInt();
        }
        
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                c[i] += a[i][j] * b[j];
            }
        }
        for(i = 0; i < n; i++){
            System.out.printf("%d\n", c[i]);
        }
        sa.close();
    }
}

