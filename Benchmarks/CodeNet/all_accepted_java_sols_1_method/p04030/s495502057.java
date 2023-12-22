import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String[] inputChar = input.split("");
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < inputChar.length; i++) {
			if ("0".equals(inputChar[i])) {
				output.add("0");
			} else if ("1".equals(inputChar[i])) {
				output.add("1");
			} else {
				if (!(output.size() == 0)) {
					output.remove(output.size() - 1);
				}
			}
		}
		for (String s : output) {
			System.out.print(s);
		}
	}
}
