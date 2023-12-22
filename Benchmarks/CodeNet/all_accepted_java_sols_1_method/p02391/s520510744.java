import java.io.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\s]+");
		//int intInputed = Integer.parseInt(inputed);

		int first = Integer.parseInt(value[0]);
		int second = Integer.parseInt(value[1]);

		if (first == second) {
			System.out.println("a == b");
		} if (first > second) {
			System.out.println("a > b");
		} if (first < second) {
			System.out.println("a < b");
		}

	}
}