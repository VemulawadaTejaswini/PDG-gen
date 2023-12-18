import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static int result = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<BigDecimal> aList = new ArrayList<>();
		//全部取る
		for (int i = 0; i < n; i++) {
			aList.add(new BigDecimal(sc.next()));
		}
		for (int i= 0; i < n; i++) {
			BigDecimal ai = aList.get(i);
			culc(aList,ai, i + 1);
		}
		System.out.println(result);
	}

	private static int culc(List<BigDecimal> aList, BigDecimal ai, int i) {
		if (i < aList.size()) {
			BigDecimal aj = aList.get(i);
			BigDecimal aiaj = ai.multiply(aj);
			int aiajInt = aiaj.intValue();
			if (aiaj.subtract(BigDecimal.valueOf(aiajInt)).doubleValue() == 0.0) {
				result++;
			}
			culc(aList, ai, i+1);
		}
		return result;
	}

}
