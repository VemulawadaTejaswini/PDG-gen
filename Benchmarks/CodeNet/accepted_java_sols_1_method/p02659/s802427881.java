import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		BigDecimal a = new BigDecimal(sc.nextBigInteger()).multiply(sc.nextBigDecimal());
        System.out.println(a.setScale(0, BigDecimal.ROUND_DOWN));
	}
}