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
			int H = Integer.parseInt(in[0]);
			int W = Integer.parseInt(in[1]);
			if (H == 0 && W == 0) {
				break;
			} else {
				if (H >= 1 && H <= 300 && W >= 1 && W <= 300) {
					for (int i = 1; i <= H; i++) {
						String result = "";
						for (int j = 1; j <= W; j++) {
							result += "#";
						}
						output.add(result);
					}
					output.add("");
				}
			}
		}
		for (String out : output) {
			System.out.println(out);
		}
	}
}