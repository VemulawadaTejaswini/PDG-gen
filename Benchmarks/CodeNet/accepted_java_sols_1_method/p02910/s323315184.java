import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dance = sc.next();
		String[] s = dance.split("");
		String result = "Yes";
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				if (s[i].equals("L")) {
					result = "No";
				}
			} else {
				if (s[i].equals("R")) {
					result = "No";
				}
			}
		}
		System.out.println(result);
	}
}