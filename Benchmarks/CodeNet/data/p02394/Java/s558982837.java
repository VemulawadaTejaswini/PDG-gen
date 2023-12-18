import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if( x - r > 0 && y - r >0 && x + r < W && y + r < H ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}