import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] states = { "none", "a", "b" };
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String in = sc.nextLine().toLowerCase();
		String state = "none";
		int count = 0;
		for (String s : in.split("")) {
			switch (state) {
			case "none":
				if ("a".equals(s)) {
					state = "a";
				}
				break;
			case "a":
				if ("b".equals(s)) {
					state = "b";
				} else {
					state = "none";
				}
				break;
			case "b":
				if ("c".equals(s)) {
					count++;
				}
				state = "none";
				break;
			}
			if(s.equals("a")) {
				state = "a";
			}
		}
		System.out.println(count);
	}
}
