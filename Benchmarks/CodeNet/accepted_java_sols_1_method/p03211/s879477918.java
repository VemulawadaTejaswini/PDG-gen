import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		in.close();
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i + 3 <= S.length(); ++i) {
			int val = Integer.parseInt(S.substring(i, i + 3));
			values.add(val);
		}

		int diff = Integer.MAX_VALUE;
		for (Integer val : values) {
			if (diff > Math.abs(val - 753)) {
				diff = Math.abs(val - 753);
			}
		}
		System.out.println(diff);
	}
}
