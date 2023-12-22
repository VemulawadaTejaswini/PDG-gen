import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    BigDecimal result = execute(sc.nextLine());
        System.out.println(result.toPlainString());
    }

    public static BigDecimal execute(String value){
        BigDecimal totalLength = new BigDecimal(value);
        BigDecimal sideLength = totalLength.divide(BigDecimal.valueOf(3),7, RoundingMode.HALF_EVEN);
        return sideLength.multiply(sideLength).multiply(sideLength);
    }

}
