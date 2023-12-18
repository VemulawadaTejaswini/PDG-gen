import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (in.hasNext()) {
			int q = in.nextInt();
			final int p = in.nextInt();
			boolean end = false;
			List<Integer> amalist = new ArrayList<Integer>();
			amalist.add(q);
			while (!end) {
				q *= 10;
				System.out.print(q / p);
				q = q % p;
				if (q == 0 || amalist.contains(q)) {
					break;
				}
				amalist.add(q);
			}
			System.out.println();
			if (q != 0 && amalist.contains(q)) {
				sb.setLength(0);
				char addC = ' ';
				for (Integer a : amalist) {
					if (a.equals(q))
						addC = '^';
					sb.append(addC);
				}
				System.out.println(sb.toString());
			}
		}
		in.close();
	}
}