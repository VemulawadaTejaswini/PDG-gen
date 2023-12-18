import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		double resultab = Math.abs(b - a) * 1.0;
		double resultvw = (v - w) * 1.0;
		double resultvwab;
		resultvwab = resultab / resultvw;

		String s;

		if (resultvwab <= 0) {
			s = "NO";
		} else {
			if (resultvwab <= t) {
				s = "YES";
			} else {
				s = "NO";
			}
		}

		System.out.println(s);

	}

}
