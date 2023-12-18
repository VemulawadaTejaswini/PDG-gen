import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigDecimal[] L = new BigDecimal[87];

		L[0] = BigDecimal.valueOf(2);
		L[1] = BigDecimal.valueOf(1);

		for(int i=2; i<=N; i++) {
			L[i] = L[i-2].add(L[i-1]);
		}
		System.out.println(L[N]);
	}

}
