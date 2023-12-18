import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int so[] = new int[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            int k = i;
            for (int j = 2; j <= i; j++) {
                while (k % j == 0) {
                    so[j]++;
                    k /= j;
                }
            }
        }
        Arrays.sort(so);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (so[i - 1] < 2) {
                a = i;
            }
            if (so[i - 1] < 4) {
                b = i;
            }
            if (so[i - 1] < 14) {
                c = i;
            }
            if (so[i - 1] < 24) {
                d = i;
            }
            if (so[i - 1] < 74) {
                e = i;
            }
        }
        count += n + 1 - e;
        count += (n + 1 - d) * (n + 1 - a - 1);
        count += (n + 1 - c) * (n + 1 - b - 1);
        count += (n + 1 - b) * (n + 1 - b - 1) * (n + 1 - a - 2) / 2;
        System.out.println(count);
    }
}