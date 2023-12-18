import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Integer> tree = new ArrayList<>();

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		for(int i = 0; i < N; i++) {
			tree.add(Integer.valueOf(scanner.nextInt()));
		}

		Collections.sort(tree);
		int size = tree.size();
		int min = 1000000000;

		for(int i = K-1; i < size; i++) {
			int diff = tree.get(i)-tree.get(i-(K-1));
			if(diff < min) {
				min = diff;
			}
		}

		System.out.println(min);
	}

}
