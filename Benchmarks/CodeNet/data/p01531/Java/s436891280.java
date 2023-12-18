import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String akstn = "akstnhmyrw";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int num = Integer.parseInt(s.charAt(i) + "");
			i++;
			char flick = s.charAt(i);
			if (num == 0) {
				if (flick =='U') {
					sb.append("nn");
					continue;
				} else {
					sb.append("w" + aiueo(flick));
					continue;
				}
			} else if (num == 1) {
				sb.append(aiueo(flick));
				continue;
			} else {
				sb.append(akstn.charAt(num - 1) + aiueo(flick));
				continue;
			}
		}
		System.out.println(sb.toString());

		sc.close();
	}

	static String aiueo(char c) {
		if (c == 'T') {
			return "a";
		} else if (c == 'L') {
			return "i";
		} else if (c == 'U') {
			return "u";
		} else if (c == 'R') {
			return "e";
		} else {
			return "o";
		}
	}
}