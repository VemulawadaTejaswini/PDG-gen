
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextLong();
    static long m = sc.nextLong();
    static long l = sc.nextLong();
    static long nm[][] = new long[(int)n][(int)m];
    static long ml[][] = new long[(int)m][(int)l];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                nm[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < l; j++){
                ml[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < l; j++){
                long result = 0;
                for (int k = 0; k < m; k++){
                 result += nm[i][k] * ml[k][j];
                }
                System.out.print(result);
                if (j != l - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

