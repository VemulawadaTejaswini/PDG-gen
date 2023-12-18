import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0 0 0 0 0 0")) {
			String[] dataset = str.split(" ");
			int[] parameter = new int[6];
			for (int i = 0; i < 6; i++) {
				parameter[i] = Integer.parseInt(dataset[i]);
			}
			int k1 = Search(parameter[0], parameter[1]);
			int k2 = Search(parameter[2], parameter[3]);
			int k3 = Search(parameter[4], parameter[5]);
			long k = LCM(k1, k2, k3);
			System.out.println(k);
			str = br.readLine();
		}
	}

	private static int Search(int a, int m) {
		int k = 1;
		int an = a % m;
		while (an != 1) {
			an = (an * a) % m;
			k += 1;
		}
		return k;
	}

	private static long LCM(int k, int l, int m) {
		long gcm1 = Euclid(k, l);
		long lcm1 = k * l / gcm1;
		long gcm2 = Euclid(lcm1, m);
		long lcm2 = lcm1 * m / gcm2;
		return lcm2;
	}

	private static long Euclid(long x, long y) {
		while (x != y) {
			if (x < y) {
				y = y - x;
			} else {
				x = x - y;
			}
		}
		return x;
	}
}