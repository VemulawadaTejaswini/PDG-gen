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
                for (int j = 1; j <= i; j++) {
                    for (int k = 1; k <= j; k++) {
                        if (i * i + j * j + k * k + i * j + j * k + k * i > l) {
                            break;
                        }
                        if (i * i + j * j + k * k + i * j + j * k + k * i == l) {
                            cnt++;
                        }
                    }
                }
            }
            sb.append(cnt);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}