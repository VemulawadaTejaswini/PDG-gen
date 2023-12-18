import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner stdIn = new Scanner(System.in);
		int width = stdIn.nextInt();
		int height = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		if (x < -100 || y < -100 || x > 100 || y > 100) {
			System.out.printf("Err!%n");
			return;
		} else if (width < 1 || height < 1 || r < 1 || width > 100 || height > 100 || r > 100) {
			System.out.printf("Err!%n");
			return;
		}
		if ((x + r <= width) && (y + r <= height) && (x - r >= 0) && (y - r >= 0)) {
			System.out.printf("Yes%n");
		} else {
			System.out.printf("No%n");
		}; 
		
	}
}
