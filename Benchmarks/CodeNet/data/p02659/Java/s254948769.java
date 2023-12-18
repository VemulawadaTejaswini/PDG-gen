import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		sc.close();
		double ans = a * b;
		String ansStr = BigDecimal.valueOf(ans).toPlainString();
		char ansChar[] = ansStr.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ansChar.length; i++) {
			if (ansChar[i] == '.') {
				break;
			} else {
				sb.append(ansChar[i]);
			}
		}
		System.out.println(sb);
	}

}
