import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] vals = sc.nextLine().split("\\s+");
			Long a = Long.parseLong(vals[0]);
			Long b = Long.parseLong(vals[1]);
			Long g = gcd(a, b);
			a /= g;
			b /= g;
			Long res = a * b * g;
	        System.out.println(res);
		}
	}
	private static Long gcd(Long a, Long b) {
		if (b == 0) return a;
		else return gcd(b, a%b);
	}
}
