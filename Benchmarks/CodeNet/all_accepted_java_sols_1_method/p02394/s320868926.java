import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = Integer.parseInt(scan.next());
		int h = Integer.parseInt(scan.next());
		int x = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());
		int r = Integer.parseInt(scan.next());
		System.out.println((((r <= x && x <= (w - r)) && (r <= y && y <= (h - r))) ? "Yes" : "No"));
		scan.close();
	}
}
