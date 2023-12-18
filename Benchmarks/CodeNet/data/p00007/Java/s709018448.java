import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 借金額
        double debt = 100000;

        // n週間後の利子計算
        double loan = debt * 0.05 * n;

        // 借金残高の1000円未満切り上げ
        BigDecimal bd1 = new BigDecimal((debt + loan) / 1000);
        BigDecimal bd2 = bd1.setScale(-1, BigDecimal.ROUND_UP);
        int result = bd2.intValue() * 1000;

        System.out.println(result);
    }
}