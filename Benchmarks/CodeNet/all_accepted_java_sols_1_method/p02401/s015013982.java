import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		List<String> output = new ArrayList<String>();
		while (scan.hasNext()) {
			String input = scan.nextLine();
			String[] in = input.split(" ");
			int a = Integer.parseInt(in[0]);
			String op = in[1];
			int b = Integer.parseInt(in[2]);

			if ("?".equals(op)) {
				break;
			} else {
				if (a >= 0 && a <= 20000 && b >= 0 && b <= 20000) {
					if ("+".equals(op)) {
						int result = a + b;
						output.add(String.valueOf(result));
					} else if ("-".equals(op)) {
						int result = a - b;
						output.add(String.valueOf(result));
					} else if ("*".equals(op)) {
						int result = a * b;
						output.add(String.valueOf(result));
					} else if ("/".equals(op)) {
						if (b != 0) {
							int result = a / b;
							output.add(String.valueOf(result));
						}
					}
				}
			}
		}
		for (String out : output) {
			System.out.println(out);
		}
	}

}