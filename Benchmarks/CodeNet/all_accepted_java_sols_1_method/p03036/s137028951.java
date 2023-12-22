import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long D = sc.nextLong();
		long x2000 = sc.nextLong();
		sc.close();

		long prev = x2000;
		for (int i = 0; i < 10; i++) {
			long ans = r * prev - D;
			System.out.println(ans);
			prev = ans;
		}
	}
}
