
//How Many Divisors?
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

		int count=0;
		
		for (int i = 1; i <= c; i++) {

			if (a <= i && i <= b) {
				if (c % i == 0) {
				count++;
				}
			}
		}

		System.out.println(count);

		
	}
}