import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int[] foods = new int[M];
		Arrays.fill(foods, 0);
		for (int i = 0; i < N; ++i) {
			Set<Integer> likeFoods = new HashSet<>();
			tokens = in.nextLine().split(" ");
			int K = Integer.parseInt(tokens[0]);
			for (int j = 1; j <= K; ++j) {
				int food = Integer.parseInt(tokens[j]);
				foods[food - 1]++;
			}
		}
		in.close();
		int result = 0;
		for (int i = 0; i < foods.length; ++i) {
			if (foods[i] == N) {
				++result;
			}
		}
		System.out.println(result);

	}

}