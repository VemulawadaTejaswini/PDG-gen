import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		while(!(x == 0 && y == 0)) {
			for(int i = 0;i < x;i++) {
				for(int j = 0;j < y;j++) {
					if(j % 2 != 0 && i % 2 != 0 || j % 2 == 0 && i % 2 == 0)
						System.out.print("#");
					else if(j % 2 == 0 && i % 2 != 0 || j % 2 != 0 && i % 2 == 0)
						System.out.print(".");
				}
				System.out.println("");
			}
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.println("");
		}
		scanner.close();
	}
}