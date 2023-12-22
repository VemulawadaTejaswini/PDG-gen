import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] rate = new int[9];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            int idx = Math.min(a[i] / 400, 8);
            rate[idx]++;
        }
        int ans = 0;
        for (int i = 0; i < rate.length - 1; i++) {
            if (rate[i] == 0) {
                continue;
            }
            ans++;
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.add(String.valueOf(Math.max(ans, 1)));
        sj.add(String.valueOf(ans + rate[8]));
        System.out.println(sj.toString());
    }

}
