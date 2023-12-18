import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner("5");
        Integer n = sc.nextInt();

        // 借金額
        double debt = 100000;

        int result = 0;

        // n週間後の借金残高計算
        for (Integer i = 0; i < n; i++) {

            // 利子5%を追加
            debt = 100000 * 0.05;

            // 借金の1000円未満切り上げ
            BigDecimal bd1 = new BigDecimal(debt / 1000);
            BigDecimal bd2 = bd1.setScale(-1, BigDecimal.ROUND_UP);
            result = bd2.intValue() * 1000;
        }

        System.out.println(result);
    }
}