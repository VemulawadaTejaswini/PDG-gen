import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int N = scan.nextInt();

		// mapにkeyとvalue格納
		for (int i = 0; i < N; i++) {
			map.put(scan.nextInt(), i + 1);
		}

		for (Integer val : map.values()) {
			System.out.print(val + " ");
		}
	}
}