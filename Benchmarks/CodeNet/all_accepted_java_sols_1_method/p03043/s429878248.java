import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		br.close();

		List<Integer> list = new ArrayList<Integer>();
		int n2 = n;
		int k2 = k;
		list.add(Math.max(n2 - k2 + 1, 0));
		while (k2 > 1) {
			n2 = Math.min(k2 - 1, n);
			k2 = (k2 + 1) / 2;
			list.add(Math.max(n2 - k2 + 1, 0));
		}

		BigDecimal ans = BigDecimal.ZERO;
		for (int i = 0; i < list.size(); i++) {
			BigDecimal bd = BigDecimal.valueOf(list.get(i)).divide(
					BigDecimal.valueOf(Math.pow(2, i)));
			ans = ans.add(bd);
		}
		System.out.println(ans.divide(BigDecimal.valueOf(n), 12, BigDecimal.ROUND_HALF_UP));
	}
}
