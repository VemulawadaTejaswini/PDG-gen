import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int amax = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (amax < a[i]) {
                amax = a[i];
            }
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int anscnt = 0;
        int i = 0;
        while (h > 0) {
            if (n - 1 - i >= 0) {
                int nage = b[n - 1 - i];
                i++;
                if (nage > amax) {
                    h = h - nage;
                } else {
                    h = h - amax;
                }
            } else {
                h = h - amax;
            }
            anscnt++;
        }
        System.out.println(anscnt);
    }
}