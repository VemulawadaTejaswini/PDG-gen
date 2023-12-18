import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int ctr = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				ctr++;
			}
		}
		System.out.println(ctr);
		sc.close();
	}
}