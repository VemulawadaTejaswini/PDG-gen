import java.util.Arrays;
import java.util.Scanner;

;

public class Main {
	static final int max = 1000000;

	public static void main(String[] args) {
		boolean numList[] = new boolean[max + 1];
		Arrays.fill(numList, true);

//		numList[0] = false;
//		numList[1] = false;

		for (int t = 2; t < max; t++) {
			if (numList[t]) {
				for (int i = t * 2; i < max; i += t) {
					numList[i] = false;
				}
			}
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long inputNum = sc.nextLong();
			int count = 0;

			for (int i = 2; i <= inputNum; i++) {
				if (numList[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}