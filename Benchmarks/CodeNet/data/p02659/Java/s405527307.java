import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * C - Multiplication 3
 * A×B  の小数点以下を切り捨て、結果を整数として出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        long a = sc.nextLong();
        double b = sc.nextDouble();

        // 計算
        double product = a * b;
        BigDecimal bd = new BigDecimal( String.valueOf( product ) );

        // 小数第一位を切り捨て
        System.out.println( bd.setScale(0, RoundingMode.DOWN) );


        sc.close();
    }
}
