import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int[][] x = new int[3][n];
        x[0][0] = a[0];
        x[1][0] = b[0];
        x[2][0] = c[0];
        for(int i = 1; i < n; i++){
            x[0][i] = Math.max(x[1][i-1], x[2][i-1]) + a[i];
            x[1][i] = Math.max(x[2][i-1], x[0][i-1]) + b[i];
            x[2][i] = Math.max(x[0][i-1], x[1][i-1]) + c[i];
        }
        System.out.println(Math.max(x[0][n-1], Math.max(x[1][n-1], x[2][n-1])));
    }
}