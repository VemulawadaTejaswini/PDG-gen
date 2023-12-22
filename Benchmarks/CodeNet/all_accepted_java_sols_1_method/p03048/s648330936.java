import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int r = Integer.parseInt(sa[0]);
		int g = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		int n = Integer.parseInt(sa[3]);
		br.close();

		long ans = 0;
		int rr = n / r;
		int gg = n / g;
		for (int i = 0; i <= rr; i++) {
			int num = r * i;
			for (int j = 0; j <= gg; j++) {
				num += g * j;
				if (num > n) {
					break;
				}
				if ((n - num) % b == 0) {
					ans++;
				}
				num -= g * j;
			}
		}
		System.out.println(ans);
	}
}
