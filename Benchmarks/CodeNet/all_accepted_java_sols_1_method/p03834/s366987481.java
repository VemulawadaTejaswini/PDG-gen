import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		for (int i = 0; i < 19; i++) {
			if (i != 5 && i != 13) {
				System.out.print(c[i]);
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}