import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		int min = 0;
		int max = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
			int num = list.get(i);
			if (i == 0) {
				min = num;
				max = num;
			}
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}