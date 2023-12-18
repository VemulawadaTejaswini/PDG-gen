import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		int x3 = 0, y3 = 0, x4 = 0, y4 = 0;
		
		if (y1 < y2)
			x3 = x2 - Math.abs(y2 - y1);
		else
			x3 = x2 + Math.abs(y2 - y1);
		
		x4 = x1 + x3 - x2;
		
		if (x1 < x2)
			y3 = y2 + Math.abs(x2- x1);
		else
			y3 = y2 - Math.abs(x2 - x1);
		
		y4 = y1 + y3 - y2;
		
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

	}

}