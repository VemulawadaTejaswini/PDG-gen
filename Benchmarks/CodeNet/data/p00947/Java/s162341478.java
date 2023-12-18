import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int[][] table = new int[10][10];

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    table[i][j] = in.nextInt();
                }
            }
            int ans = 0;
            main:
            for (int i = 0; i < 10000; i++) {
                int[] d = new int[5];
                {
                    int t = i;
                    for (int j = 0; j < 4; j++) {
                        d[3 - j] = t % 10;
                        t /= 10;
                    }
                }
                d[4] = ssn(d[0], d[1], d[2], d[3]);
                if (ssn(d) != 0) throw new RuntimeException();

                // Misuse
                for (int j = 0; j < 5; j++) {
                    int original = d[j];
                    for (int k = 0; k < 10; k++) {
                        if (original == k) continue;
                        d[j] = k;
                        if (ssn(d) == 0) {
                            //System.out.println(Arrays.toString(d)+": Misuse");
                            ans++;
                            continue main;
                        }
                    }
                    d[j] = original;
                }

                // Swap
                for (int j = 0; j < 4; j++) {
                    if (d[j] == d[j + 1]) continue;
                    swap(d, j, j + 1);
                    if (ssn(d) == 0) {
                        //System.out.println(Arrays.toString(d)+": Swap");
                        ans++;
                        continue main;
                    }
                    swap(d, j, j + 1);
                }
            }
            out.println(ans);
        }
    }

    private static int ssn(int... a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            t = table[t][a[i]];
        }
        return t;
    }

    private static void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}

