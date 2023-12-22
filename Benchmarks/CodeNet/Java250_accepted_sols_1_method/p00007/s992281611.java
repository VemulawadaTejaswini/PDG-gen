import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    // 初期の借金
    private static final BigDecimal DEBT_FIRST = new BigDecimal("100000");

    // 1週間当たりの利率
    private static final BigDecimal INTEREST_PERCENTAGE_PER_WEEK = new BigDecimal(
            "1.05");

    public static void main(String[] args) {
        try {
            // input
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));

            int weeksAfter = Integer.valueOf(br.readLine());
            BigDecimal debtAfter = DEBT_FIRST;
            for (int i = 1; i <= weeksAfter; i++) {
                // 利息をかけて1000円単位で切り上げる
                debtAfter = debtAfter.multiply(INTEREST_PERCENTAGE_PER_WEEK)
                        .setScale(-3, RoundingMode.UP);
            }

            System.out.println(debtAfter.toPlainString());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

}