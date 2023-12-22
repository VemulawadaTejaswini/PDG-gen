import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String r = scan.nextLine();
		double rr = Double.parseDouble(r);
		double x = Math.PI;
		double area = rr * rr * x;
		double len = 2 * rr * x;
		System.out.printf("%f %f\n", area, len);
		
	}
}