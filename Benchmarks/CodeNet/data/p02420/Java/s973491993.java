import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String first = scanner.next();
			if(first.equals("-")) {
				break;
			}
			int m = scanner.nextInt();
			for(int i = 0; i < m; i++) {
				int h = scanner.nextInt();
				first = first.substring(h, first.length()) + first.substring(0, h);
			}
			System.out.println(first);
		}
	}
}
