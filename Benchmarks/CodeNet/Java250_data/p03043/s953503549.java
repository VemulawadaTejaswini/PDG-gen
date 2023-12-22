import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		double ans = 0.0;
		for (int i = 1; i <= n; i++) {
			int zyo = 0;
			int zz = i;
			outer:
			for (int z = 1; z <= k;  z++) {
				if (zz >= k) {
					break outer;
				}
				zz *= 2;
				zyo ++;
			}
//			if (i == k) {
//				zyo = 0;
//			}
//			else if (i > 1) {
//			    zyo = (int) Math.floor(Math.log(k) / Math.log(i));
//			}
//			else {
//				zyo = (int) Math.floor(Math.log(k) / Math.log(2)) + 1;
//			}
//			System.out.println("i=" + i + ", zyo=" + zyo);   ////////////////////
			ans += Math.pow(0.5, zyo);
		}
		ans /= n;
		System.out.println(ans);
	}
}