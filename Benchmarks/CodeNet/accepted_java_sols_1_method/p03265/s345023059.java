import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		scan.close();
		
		int xDiff = x1 - x2;
		int yDiff = y1 - y2;
		
		int x3 = x2 + yDiff;
		int y3 = y2 - xDiff;
		
		int x4 = x3 + xDiff;
		int y4 = y3 + yDiff;
		
		System.out.print(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
