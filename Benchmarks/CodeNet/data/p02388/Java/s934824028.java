import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = null;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			input = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		int num = Integer.parseInt(input);
		int ans = calcCubic(num);
		System.out.println(ans);
	}

	/**
	 * @param num
	 * @return
	 */
	private static int calcCubic(int num) {
		return (int) Math.pow(num, 3);
	}

}