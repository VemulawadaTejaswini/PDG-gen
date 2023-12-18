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
        int[][][] summary = new int[10][45][45];
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
        long temp = 0;
        for (int digit_count = 0; digit_count < 10 ; digit_count++) {
            for (int two_count = 0; two_count < 45; two_count++) {
                for (int five_count = 0; five_count < 45; five_count++) {
                    if (summary[digit_count][two_count][five_count] == 0) {
                        continue;
                    }
                    for (int j = 0; j < 10; j++) {
                        int total_digits = digit_count + j;
                        for (int k = 0; k < 45; k++) {
                            for (int l = 0; l < 45; l++) {
                                if (summary[j][k][l] == 0) {
                                    continue;
                                }
                                int count = Math.min(two_count + k, five_count + l);
                                if (total_digits <= count) {
                                    if (j == digit_count && k == two_count && l == five_count) {
                                        temp += summary[j][k][l]*(summary[j][k][l]-1)/2;
                                    } else {
                                        ans += summary[digit_count][two_count][five_count] * summary[j][k][l];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(temp+ans/2);
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
