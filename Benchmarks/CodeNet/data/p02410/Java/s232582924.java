import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt(), m = scn.nextInt();
        int[] b = new int[m];
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        for(int i = 0, sum; i < n; i++) {
            for(int j = sum = 0; j < m; j++) {
                sum += a[i][j] * b[j];
            }
            System.out.println(sum);
        }
    }
}