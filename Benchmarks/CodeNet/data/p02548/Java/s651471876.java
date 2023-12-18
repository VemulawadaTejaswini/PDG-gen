import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
//        boolean[][][] ans = new boolean[N][N][N];

        int cnt = 0;
        for (int i = 1; i < N; i++) {
            cnt += (N - 1) / i;
        }

        System.out.println(cnt);
    }

    public static List<Integer> calcDivisor(int a) {
        List<Integer> result = new ArrayList<>();

        // あまりforEach内でlist操作したくないけど
        IntStream.range(1, ((int) Math.pow(a, 0.5)) + 1).forEach(i -> {
            if (a % i == 0) {
                result.add(i);
                if (i != a / i) {
                    result.add(a / i);
                }
            }
        });

        return result;
    }

    public static List<Integer> calcPrimeFactor(int a) {
        List<Integer> result = new ArrayList<>();

        int tmp = a;
        for (int i = 2; i <= a && tmp != 1;) {
            if (tmp % i == 0) {
                result.add(i);
                tmp /= i;
            } else {
                i++;
            }
        }

        return result;
    }
}
