import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> token = new ArrayList<>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			token.add(sc.nextInt());
		}
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int ind = sc.nextInt()-1;
			if (token.get(ind) == 2019 || token.contains(token.get(ind) + 1)) {
				continue;
			} else {
				token.set(ind, token.get(ind) + 1);
			}
		}

		for(int num : token) {
			System.out.println(num);
		}

	}
}

