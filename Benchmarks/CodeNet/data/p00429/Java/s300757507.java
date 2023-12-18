import java.util.Scanner;

public class Main {
	static String answer;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
        	answer = scanner.next();
            for (int i = 0; i < n; i++) {
                answer = makeString(answer);
            }
            System.out.println(answer);
            n = scanner.nextInt();
        }
	}
	
	public static String makeString(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			int j = 0;
			if ((i + 1 < s.length()) && (s.charAt(i) == s.charAt(i + 1))) {
				int c = 1;
				j = i;
				while ((i + 1 < s.length()) && (s.charAt(i) == s.charAt(i + 1))) {
					c++;
					i++;
				}
				r += Integer.toString(c) + Character.toString(s.charAt(j));
			}
			else {
				r += "1" + s.charAt(i);
			}
		}
		return r;
	}

}

