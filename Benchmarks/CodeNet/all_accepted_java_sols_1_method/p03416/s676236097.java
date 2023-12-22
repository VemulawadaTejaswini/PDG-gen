import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text = br.readLine().split(" ");
		int[] range_numbers = { Integer.valueOf(text[0]), Integer.valueOf(text[1]) };
		int result = 0;
		for (int i = range_numbers[0]; i <= range_numbers[1]; i++) {
			String number = String.valueOf(i);
			String a = number.substring(3, 4);
			String b = number.substring(4, 5);
			if (number.substring(0, 2).equalsIgnoreCase(b + a)) result++;
		}
		System.out.println(result);
	}
}