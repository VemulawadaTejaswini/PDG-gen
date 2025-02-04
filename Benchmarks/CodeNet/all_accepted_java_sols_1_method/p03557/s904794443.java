import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int ci = 0;
        long bn[] = new long[n];
        boolean end = false;
        for (int i = 0; i < n; i++) {
            while (c[ci] <= b[i]) {
                ci++;
                if (ci >= n) {
                    end = true;
                    break;
                }
            }
            if (end) {
                for (int j = i + 1; j < n; j++) {
                    bn[i] = 0;
                }
                break;
            } else {
                bn[i] = n;
                bn[i] -= ci;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            bn[i] += bn[i + 1];
        }

        long total = 0;
        int bi = 0;
        for (int i = 0; i < n; i++) {
            while (b[bi] <= a[i]) {
                bi++;
                if (bi >= n) {
                    System.out.println(total);
                    return;
                }
            }
            total += bn[bi];
        }

        System.out.println(total);
    }
}