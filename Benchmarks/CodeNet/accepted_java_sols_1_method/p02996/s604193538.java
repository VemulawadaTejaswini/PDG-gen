import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        Long[][] ab = new Long[N][2];

        for (int i = 0; i < N; i++) {
            ab[i][0] = Long.parseLong(scanner.next());
            ab[i][1] = Long.parseLong(scanner.next());
        }
        scanner.close();

        // 締め切りの昇順
        Arrays.sort(ab, (a, b) -> (int) (a[1] - b[1]));

        int currentTime = 0;
        for (int i = 0; i < N; i++) {
            long time = ab[i][0];
            long limit = ab[i][1];

            currentTime += time;
            if (limit < currentTime) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
