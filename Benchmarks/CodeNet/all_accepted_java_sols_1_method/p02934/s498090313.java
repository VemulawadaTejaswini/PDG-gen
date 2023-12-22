import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		double[] list = new double[totalNum];
		for(int i = 0; i < totalNum; i++) {
			list[i] = (double)sc.nextInt();
		}
		double reciprocalSum = 0;
		for(int i = 0; i < totalNum; i++) {
			reciprocalSum += 1 / list[i];
		}
		double ans = 1 / reciprocalSum;
		System.out.println(ans);
	}
}