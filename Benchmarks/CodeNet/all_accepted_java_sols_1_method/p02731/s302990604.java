import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();

		double third = L / 3.0;
		double ans = Math.pow(third, 3);
		System.out.println(String.format("%.12f", ans));
	}
}
