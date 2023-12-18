

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n1 = in.nextInt();
        final int n2 = in.nextInt();
        final long k = in.nextLong();
        in.nextLine();
        final long[] prefixA = new long[n1];
        for (int i = 0; i < n1; i++) {
            prefixA[i] = in.nextInt() + (i > 0 ? prefixA[i - 1] : 0);
        }
        in.nextLine();
        final long[] prefixB = new long[n2];
        for (int i = 0; i < n2; i++) {
            prefixB[i] = in.nextInt() + (i > 0 ? prefixB[i - 1] : 0);
        }
        in.nextLine();
        int res = 0;
        int j = n2 - 1;
        for (int i = 0; i < n1; i++) {
            if (prefixA[i] > k) {
                break;
            }
            while (j > 0 && prefixB[j] > k - prefixA[i]) {
                j--;
            }
            res = Math.max(res, i + j + 2);
        }
        System.out.println(res);
    }
}
