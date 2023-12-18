import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) {
		int i = 1;
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String arg;
			try {
				arg = br.readLine();
			} catch (IOException e) {
				break;
			}

			int num = Integer.parseInt(arg);

			if (num == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + num);
			}
			i++;
		}
	}

}