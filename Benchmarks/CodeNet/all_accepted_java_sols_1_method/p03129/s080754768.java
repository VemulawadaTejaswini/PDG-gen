import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);

		in.close();
		int count = 0;

		for (int i = 1; i <= N; i = i + 2) {
			++count;
		}
		if (count >= K) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}