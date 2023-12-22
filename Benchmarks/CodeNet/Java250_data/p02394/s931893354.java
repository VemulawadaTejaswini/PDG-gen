import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = 0, height = 0, x = 0, y = 0, radius = 0;
		
		width	= sc.nextInt();
		height	= sc.nextInt();
		x		= sc.nextInt();
		y		= sc.nextInt();
		radius	= sc.nextInt();
		
		int lowerLimmitX = radius;
		int lowerLimmitY = radius;
		
		int upperLimmitX = width		- radius;
		int upperLimmitY = height	- radius;
		
		String result = "No";
		
		if (		lowerLimmitX <= x
				&&	x <= upperLimmitX 
				&&	lowerLimmitY <= y
				&&	y <= upperLimmitY ) {
			result = "Yes";
		
		}
		
		System.out.println(result);
		
	}
}