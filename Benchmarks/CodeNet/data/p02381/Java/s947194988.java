import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<Integer> klist = new ArrayList<Integer>();
		List<String> vlist = new ArrayList<String>();
		while (true) {
			String line = sc.nextLine();
			String[] ex = line.split(" ");
			if (ex.length == 1) {
				klist.add(Integer.parseInt(line));
			} else {
				vlist.add(line);
			}
			if (line.equals("0")) {
				break;
			}

		
		}
		int i = 0;
		for (Integer in : klist) {
			if (in == 0) {
				break;
			}

			Double[] on = new Double[in];
			String vlistst = vlist.get(i);
			String[] hu = vlistst.split(" ");
			for (int j = 0; j < on.length; j++) {
				on[j] = Double.parseDouble(hu[j]);
			}
			Double ave = 0.0000;
			for (int j = 0; j < on.length; j++) {
				ave += on[j];
			}
			ave = ave / in;
			for (int j = 0; j < on.length; j++) {
				on[j] = on[j] - ave;
				on[j] = Math.pow(on[j], 2);
			}
			Double sum = 0.0;
			for (int j = 0; j < on.length; j++) {
				sum += on[j];
			}
			BigDecimal big = new BigDecimal(Math.sqrt(sum / 5));
			big.setScale(6, BigDecimal.ROUND_DOWN);
			System.out.println(big);
			i++;
		}

	}
}