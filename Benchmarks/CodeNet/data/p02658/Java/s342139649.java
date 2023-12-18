import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		BigDecimal A[] = new BigDecimal[N];
		BigDecimal seki = new BigDecimal(1);

		for(int i = 0;i<=N-1;i++) {
			A[i] = in.nextBigDecimal();
			seki = seki.multiply(A[i]);
		}
		
		int keta = seki.precision();

		if(keta > 18) {
			seki = new BigDecimal(-1);
		}
		
		System.out.println(seki);
	}
}