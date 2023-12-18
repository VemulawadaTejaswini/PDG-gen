import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        long[][] mat1 = new long[n][m];
        long[][] mat2 = new long[m][l];
        long[][] mat3 = new long[n][l];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    mat3[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < l; j++) {
                sb.append(mat3[i][j]).append(" ");
            }
            sb.delete(sb.length()-1, sb.length());
            System.out.println(sb);
        }
    }
}