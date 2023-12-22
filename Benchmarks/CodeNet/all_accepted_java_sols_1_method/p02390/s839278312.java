import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer s = sc.nextInt();
		Integer h = s / 3600;
		s %= 3600;
		Integer m = s / 60;
		s %= 60;

		System.out.println(h + ":" + m + ":" + s);

	}

}

