import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
	public static void main(String[] args) {
		Set<Integer> sosuSet = new CopyOnWriteArraySet<Integer>();
		sosuSet.add(2);
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int nextLong = in.nextInt();
			final int max = nextLong;
			int pre = 1;
			int count = 1;
			boolean isSosu = true;
			for (int val = 3; val <= max; val += 2) {
				if (sosuSet.contains(val)) {
					isSosu = true;
				} else {
					isSosu = true;
					for (int check : sosuSet) {
						if (val % check == 0) {
							isSosu = false;
							break;
						}
					}
					if (isSosu && (pre * val) < max)
						sosuSet.add(val);
				}
				if (isSosu) {
					pre = val;
					count++;
				}
			}
			System.out.println(count);
		}
	}
}