
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int[] yama = new int[10];
		for (int i = 0; i < 10; i++) {
			yama[i] = Integer.parseInt(reader.readLine());
		}
		Arrays.sort(yama);
		for (int i = 9; i > 6; i--) {
			builder.append(yama[i]).append('\n');
		}
		System.out.print(builder);
	}
}