import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		// 入力値を格納
		int n = Integer.parseInt(sc.next());
		List<BigDecimal> aList = new ArrayList<>();
		int result = 0;
		
		aList.add(new BigDecimal(sc.next()));
		for (int i = 1; i < n; i++) {
			BigDecimal ai = new BigDecimal(sc.next());
			for (BigDecimal aj : aList) {
				BigDecimal aiaj = ai.multiply(aj);
				try {
					aiaj.intValueExact();
					result++;
				} catch (Exception e) {
					// ロスト
				}
			}
			aList.add(ai);
		}
		System.out.println(result);
	}

}
