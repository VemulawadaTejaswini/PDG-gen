
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		while(true) {
			for(int i = 0;i < y;i++) {
				for(int j = 0;j < x;j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			x = scanner.nextInt();
			y = scanner.nextInt();
			if(!(x == 0 && y == 0))
				System.out.println("");
			else break;
		}
		scanner.close();
	}
}