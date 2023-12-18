import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] a) {

		Integer[] mountains = new Integer[10];
		for (int i = 0; i < 10; i++) {
			try {
				mountains[i] = Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {
				mountains[i] = 0;
			}
		}
		System.out.println(Arrays.toString(mountains));
		Arrays.sort(mountains, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(mountains[i]);
	}

}