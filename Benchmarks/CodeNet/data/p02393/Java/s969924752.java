import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readline = br.readLine();

		String[] set = readline.split(" ");

		int a = Integer.parseInt(set[0]);
		int b = Integer.parseInt(set[1]);
		int c = Integer.parseInt(set[2]);
		int temp = 0;
		if (c < b) {
			temp = b;
			b = c;
			c = temp;
		}
		if (b < a) {
			temp = a;
			a = b;
			b= temp;
		}
		if (c < b) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}

}