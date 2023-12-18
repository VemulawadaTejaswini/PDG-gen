import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		Integer n2 = 1;

		BigDecimal[] A = new BigDecimal[n];

		Integer count = 0;
		
		for (Integer i = 0; i < n; i++) {
			A[i] = new BigDecimal(sc.next());
		}

		for (Integer i = 0; i < n; i++) {
			for (Integer j = 0; j < n - n2; j++) {

				BigDecimal x = A[i].multiply(A[j + n2]);

				x.remainder(new BigDecimal(1));
				
				if (x.remainder(new BigDecimal(1)).compareTo(BigDecimal.ZERO) == 0) {
					count++;
				}
			}
			n2++;
		}

		System.out.println(count);

	}
}