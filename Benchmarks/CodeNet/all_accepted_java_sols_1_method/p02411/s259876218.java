import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		List<String> output = new ArrayList<String>();
		while (scan.hasNext()) {
			String input = scan.nextLine();
			String[] in = input.split(" ");
			int m = Integer.parseInt(in[0]);
			int f = Integer.parseInt(in[1]);
			int r = Integer.parseInt(in[2]);
			if (m == -1 && f == -1 && r == -1) {
				break;
			} else {
				if (m == -1 || f == -1) {
					output.add("F");
				} else {
					int total = m + f;
					if (total >= 80) {
						output.add("A");
					} else if (total >= 65 && total < 80) {
						output.add("B");
					} else if (total >= 50 && total < 65) {
						output.add("C");
					} else if (total >= 30 && total < 50) {
						if (r >= 50) {
							output.add("C");
						} else {
							output.add("D");
						}
					} else if (total < 30) {
						output.add("F");
					}
				}
			}
		}
		for (String out : output) {
			System.out.println(out);
		}
	}
}