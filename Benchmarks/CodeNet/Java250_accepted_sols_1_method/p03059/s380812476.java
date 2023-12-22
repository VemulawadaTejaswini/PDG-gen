import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int t = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {
			String[] tmp = br.readLine().split("\\s");
			a = Integer.parseInt(tmp[0]);
			b = Integer.parseInt(tmp[1]);
			t = Integer.parseInt(tmp[2]);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		int sum = 0;
		for (int i = 1; i <= t; i++) {
			if (i % a == 0) {
				sum += b;
			}
		}

		System.out.println(sum);
	}

}