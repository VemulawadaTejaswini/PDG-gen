import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				int[] n = new int[6];
				for (int i = 0; i < 6; i++) {
					n[i] = sc.nextInt();
				} 
				double y = (n[3] * n[2] - n[0] * n[5]) / (n[1] * n[3] - n[0] * n[4]);
				double x = (n[2] * n[4] - n[1] * n[5]) / (n[0] * n[4] - n[1] * n[3]);
	
				System.out.printf("%s %s\n", round(x), round(y));
			}
		}
	}
	
	public static String round(double d) {
		return BigDecimal.valueOf(d).setScale(3, RoundingMode.HALF_UP).toString();
	}
}