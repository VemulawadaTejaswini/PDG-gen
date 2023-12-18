

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        long res = 0;
        final int[] count = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = i; j <= n; j += i) {
                count[j]++;
            }
        }
        for (int i = 1; i <= n; ++i) {
            res += (long) count[i] * i;
        }
        System.out.println(res);
    }
}
