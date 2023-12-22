
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");
		double a = Double.parseDouble(array[0]);
		double b = Double.parseDouble(array[1]);
		double c = Double.parseDouble(array[2]);

		double x = (a + b + c) / 2;
		if (a == x || b == x || c == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
