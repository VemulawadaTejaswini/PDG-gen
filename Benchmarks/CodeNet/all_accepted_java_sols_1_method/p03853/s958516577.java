import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int i = 0;
		String[] c = new String[h];
		for(i = 0; i < h; i++) {
			c[i] = scan.next();
		}
		for(i = 0; i < h; i++) {
			System.out.println(c[i]);
			System.out.println(c[i]);
		}
		
	}
}