import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] c = new Scanner(System.in).nextLine()
		        .toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}