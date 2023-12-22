import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();
		scan.close();

		long cnt = 0;
		if (a % x == 0) cnt++;
		cnt += (b / x) - (a / x);
		System.out.println(cnt);
	}
}