import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		long aa = 1000000007;
		Scanner s = new Scanner(System.in);
		String[] tmp = s.nextLine().split(" ");
		long m = Long.parseLong(tmp[0]);
		long n = Long.parseLong(tmp[1]);
		System.out.println(calc(m, n));
	}

	public static long calc(long m, long n) {
		long aa = 1000000007;
		if(n == 1)
			return (m*m)%aa;

		long value = 0;
		if(n%2 == 0) {
			value = calc(((m)*(m)), n/2);
		}else {
			value = calc(((m)*(m)), n/2) * (m%aa);
		}
		return value;
	}

}