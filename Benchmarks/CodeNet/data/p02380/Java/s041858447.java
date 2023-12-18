import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double s = a * b * Math.sin(Math.toRadians(c)) / 2;
		double l = a + b + Math.sqrt((a * a) + (b * b) - 2 * a * b * Math.cos(Math.toRadians(c)));
		double h = b * Math.sin(Math.toRadians(c));

		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
    }
}