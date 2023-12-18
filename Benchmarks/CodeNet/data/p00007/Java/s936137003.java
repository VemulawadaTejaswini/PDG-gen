import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 借金
        double debt = 100000;

        // n週間後の借金残高計算
        for (int i = 0; i < n; i++) {

            debt = debt * 1.05;
        }

        // 借金残高の1000円未満切り上げ
        BigDecimal bd = new BigDecimal(debt / 1000);
        BigDecimal bdr = bd.setScale(-1, BigDecimal.ROUND_UP);
        int result = bdr.intValue() * 1000;

        System.out.println(result);
    }
}