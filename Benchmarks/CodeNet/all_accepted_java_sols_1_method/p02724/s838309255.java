import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int X = Integer.parseInt(W.split(" ")[0]);

		int fiveHundredYen = 0;
		int fiveYen = 0;

		fiveHundredYen = X / 500;
		fiveYen = (X - fiveHundredYen * 500) / 5;

		System.out.println(fiveHundredYen * 1000 + fiveYen * 5);

	}

}
