import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long q = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        long s = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());

        // 主処理
        double[] priceS = new double[] { q * 4.0, h * 2.0, (double) s };
        double[] priceD = new double[] { q * 8.0, h * 4.0, s * 2.0, (double) d };
        long minS = (long) Arrays.stream(priceS).min().getAsDouble();
        long minD = (long) Arrays.stream(priceD).min().getAsDouble();

        long result = n / 2 * minD + n % 2 * minS;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
