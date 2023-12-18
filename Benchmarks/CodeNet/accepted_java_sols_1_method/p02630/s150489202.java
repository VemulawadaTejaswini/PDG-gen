import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MX = 100_000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[MX + 1];
        Arrays.fill(num, 0);

        int n = in.nextInt();
        int a[] = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            num[a[i]]++;
            total += a[i];
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int b = in.nextInt();
            int c = in.nextInt();

            total += (num[b] * (c - b));
            num[c] += num[b];
            num[b] = 0;
            System.out.println(total);
        }        
    }
}