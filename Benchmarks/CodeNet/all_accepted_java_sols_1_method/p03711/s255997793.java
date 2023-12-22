import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		if ((a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
				&& (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)) {
			System.out.println("Yes");
		} else if ((a == 4 || a == 6 || a == 9 || a == 11) && (b == 4 || b == 6 || b == 9 || b == 11)) {
			System.out.println("Yes");
		} else if ((a == 2) && (b == 2)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
		{

		}
	}
}