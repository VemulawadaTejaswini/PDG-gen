import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long a = sc.nextLong();
			BigDecimal b = sc.nextBigDecimal();
			
			long b2 = b.multiply(new BigDecimal(100)).longValue();
			
			System.out.println((a*b2)/100);


		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
