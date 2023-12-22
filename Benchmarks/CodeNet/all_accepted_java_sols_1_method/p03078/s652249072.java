import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i = 0; i < x; i++)
            a[i] = sc.nextLong();
        for (int i = 0; i < y; i++)
            b[i] = sc.nextLong();
        for (int i = 0; i < z; i++)
            c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long[] ab = new long[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int pos = (i * y) + j;
                ab[pos] = a[i] + b[j];
            }
        }
        sc.close();
        Arrays.sort(ab);
        long[] abc = new long[3000 * z];
        for (int i = 0; i < Math.min(3000, x * y); i++) {
            for (int j = 0; j < z; j++) {
                int pos = (i * z) + j;
                abc[pos] = ab[(x * y) - 1 - i] + c[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < k; i++) {
            System.out.println(abc[(3000 * z) - 1 - i]);
        }
    }
}