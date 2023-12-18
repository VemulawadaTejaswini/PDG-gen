import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		int[] edge = new int[N];
		for (int i = 0; i < N; i++) {
			edge[i] = scanner.nextInt();
		}

		Arrays.sort(edge);

		int sum = 0;

		for (int i = 0; i < N-1; i++) {
			sum+=edge[i];
		}

		if (sum > edge[N-1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();
	}

}
