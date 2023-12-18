import java.util.Scanner;

public class CircleinaRectangle {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if( r <= x && x <= ( W - r ) && r <= y && y <= ( H - r )) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}