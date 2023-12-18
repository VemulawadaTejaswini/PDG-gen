import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		scan.close();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i) != t.substring(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
