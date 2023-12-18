import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] l = new long[n];
        long[][] xl = new long[n][2];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            l[i] = sc.nextLong();
            xl[i][0] = x[i] - l[i];
            xl[i][1] = x[i] + l[i];
        }
        Arrays.sort(xl, Comparator.comparingLong(a -> a[1]));
        int cnt = 1;
        long prev = xl[0][1];
        for (int i = 1; i < n; i++) {
            if (prev > xl[i][0]) {
                continue;
            }
            cnt++;
            prev = xl[i][1];
        }
        System.out.println(cnt);
    }

}
