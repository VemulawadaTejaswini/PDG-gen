import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        int[] x = new int[M];
        int[] y = new int[M];
        int[] c = new int[M];
        int amin = Integer.MAX_VALUE;
        int bmin = Integer.MAX_VALUE;
        for (int i = 0; i < A; i++) {
            a[i] = sc.nextInt();
            amin = Math.min(a[i], amin);
        }
        for (int i = 0; i < B; i++) {
            b[i] = sc.nextInt();
            bmin = Math.min(b[i], bmin);
        }
        for (int i = 0; i < M; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int ans = amin + bmin;
        for (int i = 0; i < M; i++) {
            ans = Math.min(a[x[i] - 1] + b[y[i] - 1] - c[i], ans);
        }
        System.out.println(ans);
    }

}
