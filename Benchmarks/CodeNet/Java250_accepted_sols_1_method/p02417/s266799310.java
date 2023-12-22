import java.util.Scanner;

public class Main {
	public static final int MAX = 256;

	public static void main(String[] args) {
		int i = 0, k = 0;
		char ch1 = 0;
		Scanner sc = new Scanner(System.in);
		int[] chars = new int[256];
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (i = 0; i < line.length(); i++) {
				char ch = Character.toLowerCase(line.charAt(i));
				chars[ch]++;
			}
		}
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.println(ch + " : " + chars[ch]);
	}
}