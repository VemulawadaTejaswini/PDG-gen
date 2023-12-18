import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int minValue = 0;
		int total = 0;
		for (int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			int mod = x % 10;
			if (mod != 0 && mod < min) {
				if (minValue != 0) {
					total += (minValue + 9) / 10 * 10;
				}
				min = mod;
				minValue = x;
			} else {
				total += (x + 9) / 10 * 10;
			}
		}
		if (minValue != 0) {
			total += minValue;
		}
		System.out.println(total);
	}
}
