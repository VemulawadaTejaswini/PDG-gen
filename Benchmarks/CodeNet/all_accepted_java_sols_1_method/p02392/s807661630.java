//ITP1_2_B:   Range
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] abc = in.readLine().split(" ");

		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);

		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}