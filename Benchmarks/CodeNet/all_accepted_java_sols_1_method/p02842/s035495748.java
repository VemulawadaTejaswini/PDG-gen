import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(sc.next());
        BigDecimal bign = BigDecimal.valueOf(n);
        BigDecimal consumption_tax = BigDecimal.valueOf(1.08);
        //        BigDecimal x = bign.divide(consumption_tax, RoundingMode.DOWN);
        //        BigDecimal 再計算 = x.multiply(consumption_tax);
        //        //        out.println(bign);
        //        //        out.println(x);
        //        //        out.println(x.multiply(consumption_tax));
        //        //        out.println(再計算.stripTrailingZeros());
        //        if (bign.equals(再計算.stripTrailingZeros())) {
        //            out.println(x);
        //        } else {
        //            out.println(":(");
        //        }

        boolean acflg = false;
        // 税抜価格をi円と仮定
        for (int i = 1; i <= n; i++) {
            BigDecimal x = BigDecimal.valueOf(i);
            // 税抜価格 * 1.08(小数点以下切り捨て) = 仮定の税込価格
            BigDecimal value = x.multiply(consumption_tax).setScale(0, RoundingMode.DOWN);
            // 仮定の税込価格がnと一致する場合
            if (value.equals(bign)) {
                acflg = true;
                out.println(x);
                break;
            }
        }
        if (!acflg) {
            out.println(":(");
        }

        sc.close();
        out.close();
    }

}