
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] square = new String[h];
		for (int i = 0; i < square.length; i++) {
			square[i] = sc.next();
		}
		
		for (int i = 0; i < h; i++) {
			System.out.println(square[i]);
			System.out.println(square[i]);
		}
	}
}