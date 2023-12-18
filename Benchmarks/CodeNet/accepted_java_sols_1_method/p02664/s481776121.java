import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputSplit = input.split("");
		for (String string : inputSplit) {
			if (string.equals("?")) {
				System.out.print("D");
			} else {
				System.out.print(string);
			}
		}
	}

}
