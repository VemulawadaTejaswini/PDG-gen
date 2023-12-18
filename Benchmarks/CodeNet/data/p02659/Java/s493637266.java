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
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();

        // 計算
        BigDecimal product = ( a.multiply( b ) );
        // 小数第一位を切り捨て
        System.out.println( product.setScale( 0, RoundingMode.DOWN ) );

        sc.close();
    }
}