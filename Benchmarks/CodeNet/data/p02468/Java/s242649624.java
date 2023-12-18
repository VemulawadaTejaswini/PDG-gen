import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		long aa = 1000000007;
		Scanner s = new Scanner(System.in);
		String[] tmp = s.nextLine().split(" ");
		long m = Long.parseLong(tmp[0]);
		long n = Long.parseLong(tmp[1]);
		System.out.println(calc(m, n)%aa);
	}

	public static long calc(long m, long n) {

		if(n == 1)
			return m;

		long value = 0;
		if(n%2 == 0) {
			value = calc(m*m, n/2);
		}else {
			value = calc(m*m, n/2) * m;
		}

		return value;
	}

}