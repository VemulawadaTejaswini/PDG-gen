import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		long count = 0;
		int prev = sc.nextInt();
		if (prev > x) {
			count += prev - x;
			prev = x;
		}
		for (int i = 1; i < n; i++) {
			int z = sc.nextInt();
			if (prev + z > x) {
				int sa = prev + z - x;
				count += sa;
				z -= sa;
			}
			prev = z;
		}
		System.out.println(count);
	}
}
