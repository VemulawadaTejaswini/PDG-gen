import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        //利子率
        final BigDecimal TAX_RATE = new BigDecimal("0.05");

        //端数を切り上げる際に使用する
        final int ROUND_UP_FRACTION = 1000;

        //残り借金、初期値は10万
        int deptLeft = 100000;

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        int countWeeks = Integer.parseInt(reader.readLine());

        //1週間経過ごとに残り借金に利子を加えた金額を計上する
        for (int count = 1; count <= countWeeks; count++) {
            deptLeft = BigDecimal.valueOf(deptLeft)
                    .add(BigDecimal.valueOf(deptLeft).multiply(TAX_RATE))
                    .intValue();

            //1000円未満を切り上げる処理
            int fraction = deptLeft % ROUND_UP_FRACTION;
            if (fraction != 0) {
                deptLeft = deptLeft + (ROUND_UP_FRACTION - fraction);
            }
        }
        System.out.println(deptLeft);
    }
}