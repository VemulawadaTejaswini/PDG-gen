import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var v = search(a, k);
		System.out.println(v);
	}

	private static int search(int[] a, int k) {
		var min = 0;
		var max = 1000000000;
		while (max - min > 1) {
			var mid = min + (max - min) / 2;
			var c = count(a, mid);
			//System.out.printf("%d %d %d %d\r\n", min, max, mid, c);
			if (c > k) {
				min = mid;
			} else {
				max = mid;
			}
		}

		if (max - min == 1 && count(a, min) > k) {
			min++;
		}
		return min;
	}

	private static int count(int[] a, int v) {
		var count = 0;
		for (var av : a) {
			count += Math.ceil((double)av  / v - 1);
		}
		return count;
	}
}
