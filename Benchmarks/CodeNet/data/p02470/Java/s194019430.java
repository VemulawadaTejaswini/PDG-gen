import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(eulerPhi(in.nextLong()));
	}

	static long eulerPhi(long n) {
		Map<Long, Integer> m = primeFactorize(n);
		double res = n;
		for (Entry<Long, Integer> e : m.entrySet()) {
			res *= 1.0-1.0/(double)e.getKey();
		}
		return (long)(res+0.001);
	}
	
	static public Map<Long, Integer> primeFactorize(long n) {
		Map<Long, Integer> res = new LinkedHashMap<Long, Integer>();
		long tmp=n;
		for (long i=2;i*i<=n;i++) {
			int count=0;
			while (tmp%i==0) {
				tmp/=i;
				count++;
			}
			if (count!=0) res.put(i, count);
		}
		if (tmp!=1) res.put(tmp, 1);
		if (res.size()==0) res.put(n, 1);
		return res;
	}

}