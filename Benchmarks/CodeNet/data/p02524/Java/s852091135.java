import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		double S = 0.5 * a * b * Math.sin((double)C / 180 * Math.PI);
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos((double)C / 180 * Math.PI));
		System.out.println(S);
		System.out.println(a + b + c)	;
		System.out.println(2.0 * S / a);
	}
}