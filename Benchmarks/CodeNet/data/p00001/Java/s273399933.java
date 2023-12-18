import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		final int COUNT = 10;

		Integer[] k = new Integer[COUNT];
		for (int i = 0; i < COUNT; i++) {
			k[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(k, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(k[i]);
	}
}