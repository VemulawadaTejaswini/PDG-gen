import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double distance;
		double x1,y1,x2,y2;
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		
		distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		System.out.println(distance);
	}
}