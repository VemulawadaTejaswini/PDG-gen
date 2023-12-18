import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		var n = sc.nextInt();
		var set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		sc.close();

		var result = x;
		var min = Integer.MAX_VALUE;
		for (int i = x - 50; i <= x + 50; i++) {
			if (set.contains(i)) {
				continue;
			}
			int dif = Math.abs(x - i);
			if (dif < min) {
				result = i;
				min = dif;
			}
		}

		System.out.println(result);
	}
}
