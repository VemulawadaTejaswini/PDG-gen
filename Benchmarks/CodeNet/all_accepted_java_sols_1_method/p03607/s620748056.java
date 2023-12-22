import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		TreeSet<Long> ts = new TreeSet<Long>();

		while (n-- > 0) {

			long tmp = sc.nextLong();
			if (ts.remove(tmp)) {
				continue;
			} else {
				ts.add(tmp);
			}

		}

		System.out.println(ts.size());

	}
}