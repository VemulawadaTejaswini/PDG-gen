import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] A = new int[n][m];
        int[] B = new int[m];
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        
        int[] result = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i] += A[i][j] * B[j];
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}