import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		HashMap<Integer, Integer> kamikire = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			Integer A = sc.nextInt();
			if (!kamikire.containsKey(A)) {
				kamikire.put(A, 1);
			} else {
				Integer value = kamikire.get(A);

				kamikire.put(A, ++value);
			}
		}
		int counter = 0;
		for (Integer key : kamikire.keySet()) {
			Integer value = kamikire.get(key);
			if (value % 2 != 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
