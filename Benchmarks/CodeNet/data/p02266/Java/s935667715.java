import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws Exception {
		int total = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> down = new ArrayDeque<Integer>();
		Deque<int[]> ike = new ArrayDeque<int[]>();

		String yama = br.readLine();
		for (int i = 0; i < yama.length(); i++) {
			if (yama.charAt(i) == '\\') {
				down.add(i);
			} else if (!down.isEmpty() && yama.charAt(i) == '/') {
				int a = i - down.getLast();
				total = total + a;
				while (!ike.isEmpty() && down.getLast() < ike.getLast()[0]) {
					a = a + ike.getLast()[1];
					ike.removeLast();
				}
				int[] data = { down.pollLast(), a };
				ike.add(data);
			}
		}
		System.out.println(total);
		System.out.print(ike.size());
		while (!ike.isEmpty()) {
			System.out.print(" " + ike.removeFirst()[1]);
		}
		System.out.println();
	}

}

