package local.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String...args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();

		String[] values = line.split(" ");
		if (values.length == 2) {

			String aStr = values[0];
			String bStr = values[1];
			int a = Integer.parseInt(aStr);
			int b = Integer.parseInt(bStr);

			if (a >= -1000 && b <= 1000) {
				System.out.println(a + b);
			}
		}
	}
}

