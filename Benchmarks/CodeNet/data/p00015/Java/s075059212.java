import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		long[][] ds = null;
		long n, a, b;
		n = a = b = 0;

		try {
			s = br.readLine();
			n = Long.parseLong(s);
			ds = new long[(int) n][2];

			int i = 0;
			while (null != (s = br.readLine())) {
				a = Long.parseLong(s);
				s = br.readLine();
				b = Long.parseLong(s);
				ds[i][0] = a;
				ds[i][1] = b;
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int j = 0; j < ds.length; j++) {
			if (Math.log10((double) (ds[j][0] + ds[j][1])) < 80) {
				System.out.println(ds[j][0] + ds[j][1]);
			} else {
				System.out.println("overflow");
			}
		}
	}
}