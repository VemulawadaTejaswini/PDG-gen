import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		double l = in.nextInt();
		double a  = l/3;
		l = l-a;
		double b = l/2;
		double c = (l-b);
		System.out.print(a*b*c);
	}
}