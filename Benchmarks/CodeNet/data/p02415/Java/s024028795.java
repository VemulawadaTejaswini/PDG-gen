import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		scan.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length(); i++) {
			String t = S.substring(i, i + 1);
			if(t.matches("[a-z]")) {
				sb.append(t.toUpperCase());
			}else if(t.matches("[A-Z]")) {
				sb.append(t.toLowerCase());
			}else {
				sb.append(t);
			}
		}
		System.out.println(sb.toString());
	}
}
