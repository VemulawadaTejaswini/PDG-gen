import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		if (0 <= y-r && y+r <= h && 0 <= x-r && x+r <= w) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
		scan.close();

	}

}