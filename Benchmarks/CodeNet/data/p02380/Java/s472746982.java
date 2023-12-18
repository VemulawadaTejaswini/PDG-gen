import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int side1, side2, angle;
		double area, around, height;
		
		side1 = scan.nextInt();
		side2 = scan.nextInt();
		angle = scan.nextInt();
		
		area = (double)side1 * (double)side2 * Math.sin((double)angle) / 2;
		around = (double)side1 + (double)side2 +
				Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 
						(2 * (double)side1 * (double)side2 * Math.cos((double)angle)));
		height = (double)side2 * Math.sin((double)angle);
		
		System.out.println(area);
		System.out.println(around);
		System.out.println(height);
		
		scan.close();
	}
}

