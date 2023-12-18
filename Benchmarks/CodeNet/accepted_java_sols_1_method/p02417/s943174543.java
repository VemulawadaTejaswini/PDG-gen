import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		while (sc.hasNext()) {
			line += sc.nextLine();
		}
		int len = 'z'-'a'+1;
		int cnt[] = new int[len];
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c >= 'a' && c <= 'z') {
				cnt[c-'a']++;
			}
			if (c >= 'A' && c <= 'Z') {
				cnt[c-'A']++;
			}
		}
		for (int i = 0; i < len; i++) {
			char c = (char)('a' + i);
			System.out.println(c + " : " + cnt[i]);
		}
	}
}

