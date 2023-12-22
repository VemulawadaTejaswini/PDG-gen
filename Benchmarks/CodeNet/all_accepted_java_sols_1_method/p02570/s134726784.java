import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		double d = Double.parseDouble(tokens[0]);
		int t = Integer.parseInt(tokens[1]);
		int s = Integer.parseInt(tokens[2]);
		if (d/s <= t)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
