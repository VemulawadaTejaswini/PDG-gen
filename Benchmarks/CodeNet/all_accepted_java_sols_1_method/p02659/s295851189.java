import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long bb = (long) (b * 100.0 + 0.5);
		long ans = (a * bb) / 100;

		System.out.println(ans);
	}
}
























