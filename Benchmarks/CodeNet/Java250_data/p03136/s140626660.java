import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		List<Integer> L = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			L.add(Integer.parseInt(tokens[i]));
		}
		in.close();
		Collections.sort(L);
		long sum = 0;
		for (int i = 0; i < N - 1; ++i) {
			sum += L.get(i);
		}
		if (sum > L.get(L.size() - 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}