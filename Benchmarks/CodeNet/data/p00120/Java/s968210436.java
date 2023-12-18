
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
			int n = Integer.parseInt(tokenizer.nextToken());
			int s = tokenizer.countTokens();
			int[] num = new int[s];

			for (int i = 0; i < s; i++) {
				num[i] = Integer.parseInt(tokenizer.nextToken());
			}
			Arrays.sort(num);
			Deque<Integer> deque = new ArrayDeque<Integer>();
			for (int t : num) {
				deque.offer(t);
			}
			int[] map = new int[s];
			int x = 0;
			while (!deque.isEmpty()) {
				map[x] = deque.pollFirst();
				x++;
				if (!deque.isEmpty()) {
					map[x] = deque.pollLast();
					x++;
				}
			}
			double sum = 0;
			sum += map[0];
			sum += map[s - 1];
			for (int i = 1; i < s; i++) {
				sum += Math.sqrt(map[i] * map[i - 1]) * 2;
			}
			System.out.println(sum <= n ? "OK" : "NA");
		}
	}
}