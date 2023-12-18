
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final double x = sc.nextDouble();
        final int n = sc.nextInt();
        List<Double> ngList = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            ngList.add(sc.nextDouble());
        }
        sc.close();
        double diff = 101;
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (diff > Math.abs(x - i) && !ngList.contains((double) i)) {
                diff = Math.abs(x - i);
                result = i;
            }

        }
        System.out.println(result);
    }
}
