import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int length = sc.nextInt();
        BigDecimal ans = new BigDecimal("1");
        boolean isBreak = false;
        BigDecimal max = new BigDecimal("1000000000000000000");
        for (int i = 0; i < length; i++) {
            // 0確認
            BigDecimal tmp = new BigDecimal(sc.next());
            if (tmp.equals(BigDecimal.ZERO)) {
                System.out.println(0);
                isBreak = true;
                break;
            }

            ans = ans.multiply(tmp);
        }

        if (!isBreak) {
            // 上限超過
            if (ans.compareTo(max) > 1) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }
}
