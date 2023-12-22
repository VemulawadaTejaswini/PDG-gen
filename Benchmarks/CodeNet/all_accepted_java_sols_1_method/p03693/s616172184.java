import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		int r = Integer.parseInt(array[0]);
		int g = Integer.parseInt(array[1]);
		int b = Integer.parseInt(array[2]);

		int x = (100 * r) + (10 * g) + b;

		if (x % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
