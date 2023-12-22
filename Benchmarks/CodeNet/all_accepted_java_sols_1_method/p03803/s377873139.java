
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		if (a == b) {
			System.out.println("Draw");
		} else if ((a > b || a == 1) && !(b == 1)) {
			System.out.print("Alice");
		} else if (b > a || b == 1) {
			System.out.println("Bob");
		}
	}
}
