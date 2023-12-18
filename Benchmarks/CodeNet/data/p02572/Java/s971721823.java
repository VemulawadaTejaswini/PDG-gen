import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		BigDecimal[] b = new BigDecimal[a];

		for (int i = 0; i < a; i++) {
			b[i] = sc.nextBigDecimal();
		}

		BigDecimal[] c = new BigDecimal[a];

		for (int i = a - 1; i >= 0; i--) {
			if (i < a - 1) {
				c[i] = c[i + 1].add(b[i]);
			} else {
				c[i] = b[i];
			}
		}
		
		BigDecimal answer = new BigDecimal("0");
		
		for (int i = a - 2; i >= 0; i--) {
			answer = answer.add(b[i].multiply(c[i + 1]));
		}

		answer = answer.remainder(new BigDecimal("1000000007"));

		System.out.println(answer);
	}
}
