import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String point = sc.nextLine();
		
		String[] points = point.split(" ");
		int intN = Integer.parseInt(points[0]);
		int intD = Integer.parseInt(points[1]);
		
		double d2 = intD * 2.0 + 1;
		double observer = Math.ceil(intN / d2);

		System.out.println((int)observer);
	}
}