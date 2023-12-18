

import java.math.BigInteger;
import java.util.*;

public class Main {

	private static List<Abcdn> getStrings(Scanner sc, int num) {
		List<Abcdn> stringList = new ArrayList<>();
		while(num>0) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			stringList.add(new Abcdn(n,a,b,c,d));
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Abcdn> array = getStrings(sc, n);
		for (int i = 0; i < n; i++) {
			Abcdn abcdn = array.get(i);

			Map<Long, BigInteger> map = new HashMap<>();
			map.put(0L, BigInteger.ZERO);
			map.put(1L, new BigInteger(String.valueOf(abcdn.d)));
			calc(abcdn, map, abcdn.n);
			System.out.println(map.get(abcdn.n));
		}
	}

	private static BigInteger calc(Abcdn abcdn, Map<Long, BigInteger> map, long n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		long la = (n/2)*2;
		long ua = ((n+1)/2)*2;
		long lb = (n/3)*3;
		long ub = ((n+2)/3)*3;
		long lc = (n/5)*5;
		long uc = ((n+4)/5)*5;
		String value = "1000000000000000000000000000";
		BigInteger res = new BigInteger(value);
//		if (abcdn.n < res/abcdn.d) res = abcdn.n*abcdn.d;
		res = res.min(calc(abcdn, map, la/2).add(new BigInteger(String.valueOf(abcdn.a))).add(new BigInteger(String.valueOf(Math.abs(la-n)*abcdn.d))));
		res = res.min(calc(abcdn, map, ua/2).add(new BigInteger(String.valueOf(abcdn.a))).add(new BigInteger(String.valueOf(Math.abs(ua-n)*abcdn.d))));
		res = res.min(calc(abcdn, map, lb/3).add(new BigInteger(String.valueOf(abcdn.b))).add(new BigInteger(String.valueOf(Math.abs(lb-n)*abcdn.d))));
		res = res.min(calc(abcdn, map, ub/3).add(new BigInteger(String.valueOf(abcdn.b))).add(new BigInteger(String.valueOf(Math.abs(ub-n)*abcdn.d))));
		res = res.min(calc(abcdn, map, lc/5).add(new BigInteger(String.valueOf(abcdn.c))).add(new BigInteger(String.valueOf(Math.abs(lc-n)*abcdn.d))));
		res = res.min(calc(abcdn, map, uc/5).add(new BigInteger(String.valueOf(abcdn.c))).add(new BigInteger(String.valueOf(Math.abs(uc-n)*abcdn.d))));
//		res = Math.min(res, calc(abcdn, map, ua/2) + abcdn.a + Math.abs(ua-n)*abcdn.d);
//		res = Math.min(res, calc(abcdn, map, lb/3) + abcdn.b + Math.abs(lb-n)*abcdn.d);
//		res = Math.min(res, calc(abcdn, map, ub/3) + abcdn.b + Math.abs(ub-n)*abcdn.d);
//		res = Math.min(res, calc(abcdn, map, lc/5) + abcdn.c + Math.abs(lc-n)*abcdn.d);
//		res = Math.min(res, calc(abcdn, map, uc/5) + abcdn.c + Math.abs(uc-n)*abcdn.d);
		map.put(n, res);
		return res;
	}

}

class Abcdn  {
	long n;
	long a;
	long b;
	long c;
	long d;

	public Abcdn(long n, long a, long b, long c, long d) {
		this.n = n;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}

