import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 借金額
        float debt = 100000;

        // n週間後の借金残高計算
        for (int i = 0; i < n; i++) {

            // 利子5%を追加
            debt = debt + (debt / 20);

            // 借金の1000円未満切り上げ
            BigDecimal bd1 = new BigDecimal(debt / 1000);
            BigDecimal bd2 = bd1.setScale(0, BigDecimal.ROUND_UP);
            debt = bd2.intValue() * 1000;
        }

        System.out.println((int) debt);
    }
}