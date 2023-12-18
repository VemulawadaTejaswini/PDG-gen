import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = new int[N];
        int s = 0;
        int e = N - 1;
        int j = N - 1;

        while (j >= 1) {
            ans[s++] = a[j];
            ans[e--] = a[j - 1];
            j -= 2;
        }

        if (j == 0) {
            ans[e] = a[j];
        }

        for (int i = 0; i < N; i++) {
            out.print(ans[i]);
            if (i != N - 1) {
                out.print(" ");
            }
        }
        out.println();
    }
}