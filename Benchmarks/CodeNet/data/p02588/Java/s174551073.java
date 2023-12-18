import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[][][] summary = new int[10][65][65];
        int[][] A = new int[N][3];
        for (int i = 0; i < N; i++) {
            String temp = scan.next();
            int digits = 0;
            long x = 0;
            if (temp.indexOf(".") == -1) {
                x = Long.parseLong(temp);
            } else {
                String t = temp.substring(temp.indexOf(".") + 1);
                if (Long.valueOf(t) == 0) {
                    t = "";
                }
                digits = t.length();
                String tt = temp.substring(0, temp.indexOf(".")) + t;
                x = Long.parseLong(tt);
            }
            int two_count = this.count(2, x);
            int five_count = this.count(5, x);
            summary[digits][two_count][five_count] += 1;
            A[i][0] = digits;
            A[i][1] = two_count;
            A[i][2] = five_count;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            int digit_count = A[i][0];
            int two_count = A[i][1];
            int five_count = A[i][2];
            for (int j = 0; j < 10; j++) {
                int total_digits = digit_count + j;
                for (int k = 0; k < 65; k++) {
                    for (int l = 0; l < 65; l++) {
                        if (summary[j][k][l] == 0) {
                            continue;
                        }
                        int count = Math.min(two_count + k, five_count + l);
                        if (total_digits <= count) {
                            if (j == digit_count && k == two_count && l == five_count) {
                                ans += summary[j][k][l] - 1;
                            } else {
                                ans += summary[j][k][l];
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans/2);
    }
    private int count(long base, long x) {
        int count = 0;
        while (x % base == 0) {
            count += 1;
            x /= base;
        }
        return count;
    }
}
