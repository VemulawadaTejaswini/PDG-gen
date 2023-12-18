import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static float debt = 100000;

	public static void main(String[] args) throws IOException {

		int n;
		float hell = debt;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			hell += hell * 0.05;
			hell += hell % 100 > 0 ? 1000 : 0;
			hell = (int) hell;
		}
		System.out.println((int) hell);
	}
}