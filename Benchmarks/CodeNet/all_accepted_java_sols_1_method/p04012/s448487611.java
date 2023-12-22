import java.util.*;

public class Main {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		int [] counts = new int[26];
		char[] cs = text.toCharArray();
		for (char c : cs) {
			counts[c - 'a']++;
		}
		for (int count : counts) {
			if(count % 2 == 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}