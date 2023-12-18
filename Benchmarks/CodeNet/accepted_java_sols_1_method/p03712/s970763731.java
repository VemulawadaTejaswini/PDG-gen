import java.util.Scanner;
 
public class Main {
 
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		String[] s = new String[h];
 
		for (int i = 0; i < h; i++) {
			s[i] = scanner.next();
		}
		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.println("");
		for (int i = 0; i < h; i++) {
			System.out.print("#");
			System.out.print(s[i]);
			System.out.println("#");
		}
		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
	}
}