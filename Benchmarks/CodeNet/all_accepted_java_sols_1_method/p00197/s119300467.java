import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int count;
		
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if ((x | y) == 0) {
				break;
			}
			
			int swap = x + y;
			x = Math.max(x,  y);
			y = swap - x;
			count = 0;
			while (0 < y) {
				swap = x;
				x = y;
				y = swap % y;
				count++;
			}
			System.out.println(x + " " + count);
		}
	}
}