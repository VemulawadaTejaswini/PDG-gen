import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] input = sc.next().split("");
		Map<String, Integer> left = new HashMap<>();
		Map<String, Integer> right = new HashMap<>();

		int res = 0;
		for (int i = 1; i < N; i++) {
			int tmpRes = 0;
			for (int j = 0; j < i; j++) {
				if (left.get(input[j]) == null) {
					left.put(input[j], 1);
				} else {
					left.put(input[j], left.get(input[j]) + 1);
				}
			}
			for (int j = i; j < N; j++) {
				if (right.get(input[j]) == null) {
					right.put(input[j], 1);
				} else {
					right.put(input[j], right.get(input[j]) + 1);
				}
			}
			for (Map.Entry<String, Integer> entry : left.entrySet()) {
				if (right.get(entry.getKey()) != null) {
					tmpRes++;
				}
			}
			if (tmpRes > res) {
				res = tmpRes;
			}
			left.clear();
			right.clear();
		}
		System.out.println(res);
	}
}
