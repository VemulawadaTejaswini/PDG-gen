import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		int[] count = new int[26];
		for (char c = 97; c <= 122; c++) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c)
					count[c - 97]++;
			}
			System.out.println(c + " : " + count[c - 97]);
		}
	}
}