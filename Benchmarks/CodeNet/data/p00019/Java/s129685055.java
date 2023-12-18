
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int num = Integer.parseInt(reader.readLine());
		System.out.println(factorial(num));

	}

	public static long factorial(int num) {
		if (num == 1)
			return num;
		else
			return num * factorial(num - 1);
	}
}