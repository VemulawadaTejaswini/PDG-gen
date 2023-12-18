import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] c = new String[H+1];

		for (int i = 0; i <= H; i++) {
			c[i] = "#" + sc.nextLine() + "#";
		}
		for (int i = 0; i <= W; i++) {
			System.out.print("#");
		}

		System.out.println("#");
		
		for (int i = 1; i <= H; i++) {
			System.out.println(c[i]);
		}
		
		for (int i = 0; i <= W+1; i++) {
			System.out.print("#");
		}

		sc.close();
	}
}
