import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			long a = in.nextInt();
			long b = in.nextInt();
			System.out.println(calc(a, b) + " " + a*b/calc(a, b));
		}
	}
	static long calc(long a, long b) {
		long r = a%b;
		if(r==0) return b;
		return calc(b, r);
	}
}