import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}

		Collections.sort(list, Collections.reverseOrder());
		int min = 1000000000;
		for (int i = 0; i < N - K + 1; i++) {
			min = Math.min(min, list.get(i) - list.get(i + K - 1));
		}
		System.out.println(min);

	}

}
