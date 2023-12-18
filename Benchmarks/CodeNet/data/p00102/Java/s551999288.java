import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static Scanner sc;
    public static int[][] ary;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            ary = new int[n+1][n+1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ary[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += ary[i][j];
                }
                ary[i][n] = sum;
            }
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += ary[j][i];
                }
                ary[n][i] = sum;
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ary[i][n];
            }
            ary[n][n] = sum;
            
            for (int i = 0; i < n+1; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n+1; j++) {
                    if (j != n) {
                        sb.append(ary[i][j]).append(" ");
                    } else {
                        sb.append(ary[i][j]);
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}