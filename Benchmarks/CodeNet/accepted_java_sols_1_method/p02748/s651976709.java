import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for (int i = 0 ; i < A ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < B ; i++) {
            b[i] = sc.nextInt();
        }
        int[] x = new int[m];
        int[] y = new int[m];
        int[] c = new int[m];
        for (int i = 0 ; i < m ; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt();
        }
        int min = 100000000;
        for (int i = 0 ; i < m ; i++) {
            min = Math.min(min, a[x[i]] + b[y[i]] - c[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        min = Math.min(min, a[0] + b[0]);
        System.out.println(min);
    }

}