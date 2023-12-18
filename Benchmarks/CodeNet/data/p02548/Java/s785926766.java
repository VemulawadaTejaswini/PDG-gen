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
        for (int c = 1; c < N; c++) {
            // a * b
            int aMultiB = N - c;

            // nC0~nCnの総和で行けそう？
            List<Integer> divisor = calcPrimeFactor(aMultiB);
            for (int i = 0; i < divisor.size(); i++) {
                if (i == 0) {
                    cnt++;
                    continue;
                }
                int numerator = IntStream.rangeClosed(divisor.size() - i + 1, divisor.size()).reduce(1, (sum, elm) -> sum *= elm);
                int denominator = IntStream.rangeClosed(1, i).reduce(1, (sum, elm) -> sum *= elm);

                cnt += numerator / denominator;
            }
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
