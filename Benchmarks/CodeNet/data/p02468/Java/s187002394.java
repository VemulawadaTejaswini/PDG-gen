import java.util.Scanner;


public class Main{

	static long divNum = 1000000007;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] tmp = s.nextLine().split(" ");
		long m = Long.parseLong(tmp[0]);
		long n = Long.parseLong(tmp[1]);
		System.out.println(calc(m, n));
	}

	public static long calc(long m, long n) {

		if(n == 1)
			return m%divNum;
		if(n%2 == 0)
			return calc(((m%divNum)*(m%divNum)), n/2);
		else
			return (calc((m%divNum)*(m%divNum), n/2) * (m%divNum));
	}
}