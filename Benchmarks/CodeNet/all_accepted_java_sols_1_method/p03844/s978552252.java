

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");
		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[2]);

		System.out.println(cut[1].equals("+") ? a + b : a - b);
	}
}