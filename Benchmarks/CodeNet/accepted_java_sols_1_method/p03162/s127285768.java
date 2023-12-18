import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] a = new int[N  + 1], b = new int[N + 1], c = new int[N + 1];
        int[][] f = new int[N + 1][3];
        for(int i = 1; i <= N; i ++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for(int i = 1; i <= N; i ++){
            f[i][0] = Math.max(f[i - 1][1],f[i - 1][2]) + a[i];
            f[i][1] = Math.max(f[i - 1][0],f[i - 1][2]) + b[i];
            f[i][2] = Math.max(f[i - 1][1],f[i - 1][0]) + c[i];
        }

        System.out.println(Math.max(Math.max(f[N][0],f[N][1]),f[N][2]));
    }
}