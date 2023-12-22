import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int x = Integer.parseInt(scan.next());
			int y = Integer.parseInt(scan.next());
			
			if (x == 0 && y == 0) {
				break;
			}
			
			if (x > y) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			
			System.out.println(x + " " + y);
		}
	}
}