import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        var sb = new StringBuilder();
        for (int l = 1; l <= n; l++) {
            int cnt = 0;
            for (int i = 1; i * i <= n; i++) {
                for (int j = 1; j * j <= n; j++) {
                    int c = i * i + j * j + i * j - l;
                    int b = i + j;
                    double ans1 = (-b + Math.sqrt((b * b) - 4 * c)) / 2.0;
                    if (!Double.isNaN(ans1) && ans1 > 0.0 && (int)ans1 == ans1) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}