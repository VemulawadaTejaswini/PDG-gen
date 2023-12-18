import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String[] s = new String[h];
		int i = 0;
		for(i = 0; i < h; i++) {
			s[i] = scan.next();
		}
		for(i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
		for(i = 0; i < h; i++) {
			System.out.println("#" + s[i] + "#");
		}
		for(i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}