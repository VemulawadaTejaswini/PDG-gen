import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		var q = sc.nextInt();
		var b = new int[q];
		var c = new int[q];
		for (int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();

		var sum = 0L;
		var count = new int[100001];
		for (int i = 0; i < n; i++) {
			sum += a[i];
			count[a[i]]++;
		}

		for (int i = 0; i < q; i++) {
			sum += (c[i] - b[i]) * count[b[i]];
			count[c[i]] += count[b[i]];
			count[b[i]] = 0;
			System.out.println(sum);
		}
	}
}
