import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] str = new Scanner(System.in).nextLine().replace(',', ' ').replace('.', ' ').split(" ");
		boolean isF = true;
		for (String s : str) {
			int l = s.length();
			if (3 <= l && l <= 6) {
				if (!isF) {
					System.out.print(' ');
				}
				System.out.print(s);
				isF = false;
			}
		}
		System.out.println();
	}
}