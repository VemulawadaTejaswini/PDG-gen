import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");

		Double[] d = new Double[k.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = Double.parseDouble(k[i]);
		}
		double sin = Math.sin(Math.toRadians(d[2]));
		double cos = Math.cos(Math.toRadians(d[2]));

		Double c = Math.sqrt((Math.pow(d[0], 2) + Math.pow(d[1], 2)) - 2 * d[0]
				* d[1] * cos);

		Double men = (sin * d[0] * d[1]) / 2;

		Double shuu = d[0] + d[1] + c;
		Double high = men*2/d[0];

		BigDecimal bighigh = new BigDecimal(high);
		BigDecimal bigshuu = new BigDecimal(shuu);
		BigDecimal bigmen = new BigDecimal(men);
		bighigh.setScale(5, BigDecimal.ROUND_DOWN);
		bigshuu.setScale(5, BigDecimal.ROUND_DOWN);
		bigmen.setScale(5, BigDecimal.ROUND_DOWN);
		System.out.println(bigmen);
		System.out.println(bigshuu);
		System.out.println(bighigh);

	}
}