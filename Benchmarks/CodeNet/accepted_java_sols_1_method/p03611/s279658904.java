
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] cnt = new int[100002];

            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                cnt[a]++;
                cnt[a + 1]++;
                if ( a - 1 >= 0 ) {
                    cnt[a - 1]++;
                }
            }

            int maxCnt = -1;

            for (int i = 0; i <= 100000; i++) {
                maxCnt = Math.max(maxCnt, cnt[i]);
            }
            System.out.println(maxCnt);
        }
    }
}
