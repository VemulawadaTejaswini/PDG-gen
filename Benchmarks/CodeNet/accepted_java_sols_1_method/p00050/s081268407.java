import java.util.Scanner;

public class Main {
	public static final String[] key = {"apple", "peach"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String before = sc.nextLine();
		for (int i = 0; i < before.length(); i++) {
			if (i + 4 > before.length()) {
				sb.append(before.charAt(i));
			} else if ((before.substring(i, i + 5)).equals(key[0])) {
				sb.append(key[1]);
				i += 4;
			} else if ((before.substring(i, i + 5)).equals(key[1])) {
				sb.append(key[0]);
				i += 4;
			} else {
				sb.append(before.charAt(i));
			}
		}
		
		String after = sb.toString();
		System.out.println(after);
	}
}