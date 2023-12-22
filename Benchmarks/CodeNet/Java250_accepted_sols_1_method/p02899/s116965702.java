import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			map.put(sc.nextInt(), i + 1);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(map.get(i + 1) + " ");
		}
		System.out.println();

		sc.close();
	}

}
