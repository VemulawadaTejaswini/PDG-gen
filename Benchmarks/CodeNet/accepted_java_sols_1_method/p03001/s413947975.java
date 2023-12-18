import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();

		double area = (double) W * H / 2;
		int flg = 0;
		if ((double) x == (double) W / 2 && (double) y == (double) H / 2) {
			flg = 1;
		}
		System.out.println(area + " " + flg);
	}
}
