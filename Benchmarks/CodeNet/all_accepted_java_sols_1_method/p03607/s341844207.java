import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<Long> ha = new HashSet<Long>();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			long tmp = sc.nextLong();

			if (ha.remove(tmp)) {
			} else {
				ha.add(tmp);
			}

		}

		System.out.println(ha.size());


	}

}
