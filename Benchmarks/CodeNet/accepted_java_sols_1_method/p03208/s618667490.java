
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Long> tree = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			tree.add(sc.nextLong());
		}
		Collections.sort(tree);
		long min = (long) Math.pow(10, 9);
		for(int i = 0; i < N - (K - 1); i++) {
			long tmp = tree.get(i + K - 1) - tree.get(i);
			min = Math.min(min, tmp);
		}
		System.out.println(min);
	}

}
