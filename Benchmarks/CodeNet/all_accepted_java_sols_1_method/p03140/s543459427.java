
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] A = sc.next().split("");
		String[] B = sc.next().split("");
		String[] C = sc.next().split("");

		int result = 0;
		for (int i = 0; i < N; i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put(A[i], 0);
			if (map.get(B[i]) == null) {
				map.put(B[i], 0);
			} else {
				map.put(B[i], map.get(B[i]) + 1);
			}

			if (map.get(C[i]) == null) {
				map.put(C[i], 0);
			} else {
				map.put(C[i], map.get(C[i]) + 1);
			}

			if (map.size() == 3) {
				result += 2;
			} else if (map.size() == 2) {
				result++;
			}
		}

		System.out.println(result);

	}
}