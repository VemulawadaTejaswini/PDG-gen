import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = in.nextInt() - 1;
        }

        long[] cand = new long[n];
        Arrays.fill(cand, k - q);
        for (int i = 0; i < q; i++) {
            cand[a[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (cand[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}