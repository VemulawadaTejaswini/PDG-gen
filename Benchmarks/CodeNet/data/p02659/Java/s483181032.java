import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal num1 = new BigDecimal(sc.next());
		BigDecimal num2 = new BigDecimal(sc.next());
		BigDecimal mul = num1.multiply(num2);
		BigDecimal result = mul.setScale(0, RoundingMode.DOWN);

		long out = result.longValue();


		System.out.println(out);
		sc.close();

	}

}