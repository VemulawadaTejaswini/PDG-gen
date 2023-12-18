import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	private static final int MOD = 2019;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var chars = s.toCharArray();
		var numbers = IntStream.range(0, chars.length).map(i -> Integer.valueOf(chars[i] - '0')).toArray();
		sc.close();

		var calc = new int[MOD][10];
		for (var i = 0; i < MOD; i++) {
			for (var j = 0; j < 10; j++) {
				calc[i][j] = (i * 10 + j) % MOD;
			}
		}

		var count = 0L;
		var init = new long[MOD];
		var set1 = new long[MOD];
		var set2 = new long[MOD];
		for (var i = 0; i < numbers.length; i++) {
			for (var j = 0; j < MOD; j++) {
				if (set1[j] > 0) {
					var number = calc[j][numbers[i]];
					if (number == 0) {
						count += set1[j];
					}
					set2[number] += set1[j];
				}
			}
			set2[numbers[i]]++;
			System.arraycopy(set2, 0, set1, 0, MOD);
			System.arraycopy(init, 0, set2, 0, MOD);
		}

		System.out.println(count);
	}
}