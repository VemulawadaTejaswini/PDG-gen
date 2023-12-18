import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> datasets = new ArrayList<>();
		String dataset;
		double x, y, ad_bc;

		try {
			while((dataset = br.readLine()) != null) {
				datasets.add(dataset);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(String eachLine : datasets) {
			String[] eachStr = eachLine.split(" ");
			int[] each = new int[eachStr.length];
			for(int i = 0; i < eachStr.length; i++) {
				each[i] = Integer.parseInt(eachStr[i]);
			}

			ad_bc = each[0] * each[4] - each[1] * each[3];
			x = (each[4] / ad_bc * each[2]) + (-each[1] / ad_bc * each[5]);
			y = (-each[3] / ad_bc * each[2]) + (each[0] / ad_bc * each[5]);

			BigDecimal bx = new BigDecimal(x);
			BigDecimal by = new BigDecimal(y);

			System.out.print(bx.setScale(3, BigDecimal.ROUND_HALF_UP) + " " + by.setScale(3, BigDecimal.ROUND_HALF_UP));
		}
	}
}