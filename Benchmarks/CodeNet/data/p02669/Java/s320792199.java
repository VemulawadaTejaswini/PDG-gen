
import java.util.*;

public class Main {

	private static List<Abcdn> getStrings(Scanner sc, int num) {
		List<Abcdn> stringList = new ArrayList<>();
		while(num>0) {
			double n = sc.nextDouble();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
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

			Map<Double, Double> map = new HashMap<>();
			map.put(0D, 0D);
			map.put(1D, abcdn.d);
			calc(abcdn, map, abcdn.n);
			System.out.println(map.get(abcdn.n).longValue());
		}
	}

	private static Double calc(Abcdn abcdn, Map<Double, Double> map, double n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		long la = (((long)(n))/2)*2;
		long ua = (((long)(n+1))/2)*2;
		long lb = (((long)n)/3)*3;
		long ub = (((long)(n+2))/3)*3;
		long lc = (((long)n)/5)*5;
		long uc = (((long)(n+4))/5)*5;
        double res = Math.pow(10, 18);
		res = Math.min(res, calc(abcdn, map, la/2) + abcdn.a + Math.abs(la-n)*abcdn.d);
		res = Math.min(res, calc(abcdn, map, ua/2) + abcdn.a + Math.abs(ua-n)*abcdn.d);
		res = Math.min(res, calc(abcdn, map, lb/3) + abcdn.b + Math.abs(lb-n)*abcdn.d);
		res = Math.min(res, calc(abcdn, map, ub/3) + abcdn.b + Math.abs(ub-n)*abcdn.d);
		res = Math.min(res, calc(abcdn, map, lc/5) + abcdn.c + Math.abs(lc-n)*abcdn.d);
		res = Math.min(res, calc(abcdn, map, uc/5) + abcdn.c + Math.abs(uc-n)*abcdn.d);
		map.put(n, res);
		return res;
	}

}

class Abcdn  {
	double n;
	double a;
	double b;
	double c;
	double d;

	public Abcdn(double n, double a, double b, double c, double d) {
		this.n = n;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}

