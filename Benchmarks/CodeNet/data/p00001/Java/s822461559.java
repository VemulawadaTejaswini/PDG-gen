import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] args) {

		Integer[] k = new Integer[args.length];
		for (int i = 0; i < args.length; i++) {
			k[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(k, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(k[i]);
	}
}