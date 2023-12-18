import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long result;
		if(Math.abs(x) / k >= d) {
			result = x - (k*d);
		}
		else {
			long c = Math.abs(x) / d;
			long t = k -c;
			if(t % 2 == 0) {
				result = Math.abs(x) - c * d;
			}
			else {
				result = Math.abs(Math.abs(x) - (c+1) * d);
			}
		}
		System.out.println(result);
	}
}