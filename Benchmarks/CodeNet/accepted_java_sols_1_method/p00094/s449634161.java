import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] str2 = str.split(" ");
			int[] x = new int[2];

			for (int i = 0; i < 2; i++) {
				x[i] = Integer.parseInt(str2[i]);
			}

			double ans = (x[0] * x[1]) / 3.305785;

			System.out.println(ans);

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}