import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		ArrayList<Integer> li = new ArrayList<Integer>();
		a = in.nextInt();
		b = in.nextInt();
		int max = Math.max(a, b);
		for (int i = 0; i < max; i++) {
			if (Math.abs((a - i)) == Math.abs((b - i))) {
				li.add(i);
			}
		}
		if (li.size() != 0) {
			for (int i = 0; i < li.size(); i++) {
				if (i != li.size() - 1)
					System.out.print(li.get(i) + " ");
				else
					System.out.println(li.get(i));
			}
		} else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}
