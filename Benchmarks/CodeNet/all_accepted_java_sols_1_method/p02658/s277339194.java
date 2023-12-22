import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static BigInteger THRESHOLD_VALUE = BigInteger.valueOf(1000000000000000000L);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        // 取得と同時に乗算をすると閾値が超えた後に 0 が来た場合に WA になるため、保持する
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(scanner.next());
            if (num == 0) {
                System.out.println("0");
                return;
            }
            a[i] = num;
        }

        BigInteger ans = BigInteger.ONE;
        for (long num : a) {
            ans = ans.multiply(BigInteger.valueOf(num));

            if (ans.compareTo(THRESHOLD_VALUE) > 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans.toString());
    }
}
