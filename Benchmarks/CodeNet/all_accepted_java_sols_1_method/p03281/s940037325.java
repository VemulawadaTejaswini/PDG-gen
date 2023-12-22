import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ret = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) continue;

            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
                if (cnt > 8) break;
            }

            if (cnt == 8) ret++;
        }

        System.out.println(ret);
    }
}