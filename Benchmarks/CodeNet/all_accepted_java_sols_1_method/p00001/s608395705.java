import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] mountains = new Integer[10];
		for (int i = 0; i < 10; i++) {
			mountains[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(mountains, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(mountains[i]);
	}
}