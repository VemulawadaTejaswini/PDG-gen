import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int a = 0;
		int b = 0;
		int c = 0;
		int answer = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] result = str.split(" ");

		a = Integer.parseInt(result[0]);
		b = Integer.parseInt(result[1]);
		c = Integer.parseInt(result[2]);

		for (int i = a; i <= b; i += 1) {
			if (c % i == 0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}