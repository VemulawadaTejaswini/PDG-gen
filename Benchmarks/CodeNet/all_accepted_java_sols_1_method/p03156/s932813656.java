import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		List<Integer> P = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			P.add(in.nextInt());
		}

		in.close();

		List<Integer> firsts = new ArrayList<>();
		List<Integer> seconds = new ArrayList<>();
		List<Integer> thirds = new ArrayList<>();
		for (Integer p : P) {
			if (p <= A) {
				firsts.add(p);
			} else if (A + 1 <= p && p <= B) {
				seconds.add(p);
			} else if (B + 1 <= p) {
				thirds.add(p);
			}
		}
		System.out.println(Math.min(firsts.size(), Math.min(seconds.size(), thirds.size())));
	}
}