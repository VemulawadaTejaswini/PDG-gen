import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			List<Double> ret = new ArrayList<Double>();
			do {
				int n = Integer.parseInt(br.readLine());
				if (n == 0) {
					break;
				}
				String[] s = br.readLine().split(" ");
				int i, num, sum = 0;
				double ave;
				for (i = 0; i < n; i++) {
					num = Integer.parseInt(s[i]);
					sum = sum + num;
				}
				double hoge = 0.0;
				ave = (double) sum / n;
				for (i = 0; i < n; i++) {
					num = Integer.parseInt(s[i]);
					hoge = hoge + Math.pow((num - ave), 2);
				}
				ret.add(Math.sqrt(hoge / n));
			} while (true);
			for (double d : ret) {
				System.out.println(String.format("%.8f", d));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}