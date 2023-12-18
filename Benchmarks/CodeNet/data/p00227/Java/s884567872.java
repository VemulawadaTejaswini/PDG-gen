import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        // n m
        // p1 p2 ... pn
        while (true) {
            int n = in.nextInt(), m = in.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            Arrays.sort(p);
            for (int i = 0; i < p.length / 2; i++) {
                int tmp = p[i];
                p[i] = p[p.length - 1 - i];
                p[p.length - 1 - i] = tmp;
            }
            int sum = 0;
            int i = 0;
            int j = 0;
            while (j < n) {
                if (i == m - 1) {
                    i = 0;
                } else {
                    i++;
                    sum += p[j];
                }
                j++;
            }
            System.out.println(sum);
        }
    }
}