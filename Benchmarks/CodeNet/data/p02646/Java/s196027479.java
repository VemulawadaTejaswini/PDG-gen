import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int W = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        int[] b = new int[T];
        a[0] = A;
        b[0] = B;
        int c = 0;
        if ( V >= W) {
            System.out.println("NO");
        } else {
            for (int i = 1; i < T; i++) {
                if ( b[i-1] >= a[i-1]) {
                    a[i] = W + a[i-1];
                    b[i] = V + b[i-1];
                } else {
                    a[i] = -W + a[i-1];
                    b[i] = -V + b[i-1];
                }
            }
            for (int i = 0; i < T; i++) {
                if ( a[i] == b[i]) {
                    c = c + 1;
                } else {
                    c = c;
                }
            }
            if ( c >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}