import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			int[] chars = new int[256];
			for (int i = 0; i < s.length(); i++) {
				char ch = Character.toLowerCase(s.charAt(i));
				chars[ch]++;
			}
		}
		for (char ch = 97; ch <= 122; ch++) {
			System.out.println(ch + " : " + chars[ch]);
		}
	}
}