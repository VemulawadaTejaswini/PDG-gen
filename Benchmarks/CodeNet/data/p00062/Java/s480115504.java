import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int[] top = new int[10];
			for (int i = 0; i < 10; i++) {
				top[i] = line.charAt(i) - 48;
			}
			System.out.println(getBottommost(top));
		}
	}

	public static int getBottommost(int[] top) {

		if (top.length == 1) {
			return top[0];
		}

		int[] bottom = null;
		do {
			bottom = getBottom(top);
			top = bottom;
		} while (bottom.length > 1);

		return bottom[0];
	}

	public static int[] getBottom(int[] top) {

		if (top.length == 1) {
			return top;
		}

		int[] bottom = new int[top.length - 1];
		for (int i = 0; i < top.length - 1; i++) {
			bottom[i] = (top[i] + top[i + 1]) % 10;
		}
		return bottom;
	}
}