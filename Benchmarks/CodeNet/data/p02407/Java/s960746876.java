import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputArrayNum = Integer.parseInt(br.readLine()) - 1;
			String[] inputStr = br.readLine().split(" ");

			for (int i = 0; i < inputArrayNum + 1; i++) {
				System.out.print(inputStr[inputArrayNum - i]);

				if (i != inputArrayNum) {
					System.out.print(" ");
				} else {
					System.out.print("");
				}
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}