import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<BigDecimal> list = new ArrayList<BigDecimal> ();
		Map<BigDecimal,Integer> map = new HashMap<BigDecimal,Integer>();
		BigDecimal b = new BigDecimal("0.0001");
		BigDecimal one = new BigDecimal(10000);
		while (b.compareTo(new BigDecimal(1)) < 0) {
			try {
				BigDecimal temp = one.divide(b);
				String s = temp.stripTrailingZeros().toPlainString();
				if (s.contains(".") == false ) {
					map.put(b, 0);
					list.add(b);
				}
				temp = b;
				while (true) {
					temp = temp.multiply(new BigDecimal(10));
					if (temp.compareTo(one)<0 ) {
						if (temp.compareTo(new BigDecimal(1))>=0) {
							map.put(temp, 0);
							list.add(temp);
						}
					} else {
						break;
					}
				}
			} catch (Exception e) {

			}
			b = b.add(new BigDecimal("0.0001"));
		}
		Collections.sort(list);
		BigDecimal A[] = new BigDecimal[N];
		for (int i=0;i<N;i++) {
			String s = sc.next();
			BigDecimal temp = new BigDecimal(s);
			A[i] = temp;
			for (BigDecimal t: list) {
				try {
					BigDecimal tm = temp.divide(t);
					String s1 = tm.stripTrailingZeros().toPlainString();
					if (s.contains(".") == false ) {
						Integer in = map.get(t);
						map.put(t, in+1);
					}
				} catch (Exception e) {

				}
			}
		}
		long count =0;
		for (int i=0;i<N;i++) {
			for (int j=0;j<list.size();j++) {
				BigDecimal t = list.get(j);
				BigDecimal temp = A[i].multiply(t);
				String s = temp.stripTrailingZeros().toPlainString();
				if (s.contains(".") == false ) {
					int c = map.get(t);
					try {
						BigDecimal te = A[i].divide(t);
						s = te.stripTrailingZeros().toPlainString();
						if (s.contains(".") == false ) {
							c --;
						}
					} catch(Exception ex ) {

					}
					count +=c;
					break;
				}
			}
		}
		System.out.println(count/2);
	}
}