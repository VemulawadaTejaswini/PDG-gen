import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[k.length];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(k[i]);
		}
		int a = Math.abs(v[2]-v[0]);
		int b = Math.abs(v[3]-v[1]);
		Double val = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		BigDecimal big = new BigDecimal(val);
		big.setScale(5,BigDecimal.ROUND_DOWN);
		System.out.println(big);
	}
}