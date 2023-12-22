import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			Integer[] v = new Integer[n];
			for(int i = 0 ; i < n ; i++) {
				v[i] = sc.nextInt();
			}
			Arrays.sort(v);
			BigDecimal mixed = new BigDecimal(v[0].toString());
			for(int i = 1 ; i < n ; i++) {
				mixed = mixed.add(new BigDecimal(v[i].toString())).divide(new BigDecimal("2"));
			}
			System.out.println(mixed.toString());
		}

	}

}
