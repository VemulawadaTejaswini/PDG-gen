import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);// ????¬???????
		String[] k1 = new String[2];
		for (int i = 0; i < 2; i++) {
			k1[i] = sc.nextLine();// ?????????????????????
		}
		String[] k2 = k1[0].split(" ");
		String[] k3 = k1[1].split(" ");// ???????????????String?????????
		Double[] d1 = new Double[v];
		Double[] d2 = new Double[v];// ?????????double
		for (int i = 0; i < v; i++) {
			d1[i] = Double.parseDouble(k2[i]);
			d2[i] = Double.parseDouble(k3[i]);// double?????£??\?????????
		}
		Double[] p = new Double[4];// ?????????????????????????????????
		for (int i = 0; i < p.length; i++) {// ???????????°??????

			if (i == 0) { // i???1??????
				Double[] an1 = new Double[v];
				p[0] = 0.0;
				for (int j = 0; j < an1.length; j++) {
					an1[j] = Math.abs(d1[j] - d2[j]);

					p[0] += an1[j];

				}
			}
			if (i == 1) {
				Double[] an2 = new Double[v];
				p[1] = 0.0;
				for (int j = 0; j < an2.length; j++) {
					an2[j] = Math.pow(Math.abs(d1[j] - d2[j]), 2);

					p[1] += an2[j];

				}
				p[1]=Math.sqrt(p[1]);
			}
			if (i == 2) {
				Double[] an3 = new Double[v];
				p[2] = 0.0;
				for (int j = 0; j < an3.length; j++) {
					an3[j] = Math.pow(Math.abs(d1[j] - d2[j]), 3);
					
					p[2] += an3[j];

				}
				p[2]=Math.cbrt(p[2]);
			}
			if (i == 3) {
				Double[] an4 = new Double[v];
				p[3] = 0.0;
				for (int j = 0; j < an4.length; j++) {
					an4[j] = Math.abs(d1[j] - d2[j]);

					if (p[3] < an4[j]) {
						p[3] = an4[j];
					}

				}
			}

		}
		BigDecimal ans0 = new BigDecimal(p[0]);
		ans0.setScale(6, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal ans1 = new BigDecimal(p[1]);
		ans1.setScale(6, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal ans2 = new BigDecimal(p[2]);
		ans2.setScale(6, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal ans3 = new BigDecimal(p[3]);
		ans3.setScale(6, BigDecimal.ROUND_HALF_DOWN);
		for (int j = 0; j < p.length; j++) {
			System.out.println(p[j]);
		}

	}
}