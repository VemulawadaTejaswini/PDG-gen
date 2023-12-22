import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		System.out.println(x >= r && x <= w - r && y >= r && y <= h - r ? "Yes" : "No");
		scan.close();
	}

}
