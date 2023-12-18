import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int side1, side2, angle;
		double area, around, height, rad;
		
		side1 = scan.nextInt();
		side2 = scan.nextInt();
		angle = scan.nextInt();
		rad = Math.toRadians(angle);
		
		
		area = (side1 * side2 * Math.sin(rad)) / 2;
		around = side1 + side2 +
				Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 
						(2 * side1 * side2 * Math.cos(rad)));
		height = side2 * Math.sin(rad);
		
		System.out.println(area);
		System.out.println(around);
		System.out.println(height);
		
		scan.close();
	}
}

