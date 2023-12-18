import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }

        int nextleft = 0;
        int nextRight = n - 1;
        BigDecimal leftLen = BigDecimal.ZERO;
        BigDecimal rightLen = BigDecimal.ZERO;
        while (nextleft <= nextRight) {
            if (leftLen.compareTo(rightLen) <= 0) {
                leftLen = leftLen.add(BigDecimal.valueOf(as[nextleft]));
                nextleft++;
            } else {
                rightLen = rightLen.add(BigDecimal.valueOf(as[nextRight]));
                nextRight--;
            }
        }

        System.out.println(leftLen.subtract(rightLen).abs());
    }
}
