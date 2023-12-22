import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");
		String a = array[0];
		String b = array[1];

		if (a.equals("H")) {
			if (b.equals("H")) {
				System.out.println("H");
			} else {
				System.out.println("D");
			}
		} else if (a.equals("D")) {
			if (b.equals("H")) {
				System.out.println("D");
			} else {
				System.out.print("H");
			}

		}
	}
}
