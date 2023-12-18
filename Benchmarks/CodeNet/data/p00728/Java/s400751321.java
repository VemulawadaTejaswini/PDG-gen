import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(stdin.hasNext()) {
			int n = stdin.nextInt();
			List<Integer> scores = new ArrayList<Integer>();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				scores.add(stdin.nextInt());
			}
			Collections.sort(scores);
			int sum = 0;
			for (int i = 1; i < n - 1; i++) {
				sum += scores.get(i);
			}
			System.out.println(sum / (n - 2));
		}
		System.exit(0);
	}
}