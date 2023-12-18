import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double ab=s.nextDouble();
		ab=Math.toRadians(ab);
		System.out.println(a*b*Math.sin(ab)/2);
		System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(ab)/2));
		System.out.println(b*Math.sin(ab));
	}
}