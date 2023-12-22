import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        var sb = new StringBuilder();
        for (int l = 1; l <= n; l++) {
            int cnt = 0;
            for (int i = 1; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
                    for (int k = 1; k < 100; k++) {
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