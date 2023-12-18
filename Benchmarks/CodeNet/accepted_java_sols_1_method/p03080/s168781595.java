import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red = 0;
		char a = 'R';
		sc.nextLine();
		String str = sc.nextLine();
		for (char x : str.toCharArray()) {
			if (x == a) {
				red++;
			} else {
				red--;
			}
		}
		if (red > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}