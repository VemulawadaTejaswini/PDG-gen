import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		int i = 1;
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int num = Integer.parseInt(br.readLine());

			if (num != 0) {
				System.out.println("Case " + i + ": " + num);
			}
			i++;
		}
	}

}