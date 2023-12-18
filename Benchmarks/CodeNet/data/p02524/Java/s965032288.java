import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		System.out.printf("%f\n%f\n%f\n", squareCalc(a, b, C), anotherLength(a, b, C), heightCalc(b, C));	
	}
	static double squareCalc(int a, int b, int C)
	{
		return(0.5 * (double)a * b * Math.sin((double)C * Math.PI / 180));
	}
	static double anotherLength(int a, int b, int C)
	{
		return(a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos((double)C * Math.PI / 180)));
	}
	static double heightCalc(int b, int C)
	{
		return(b * Math.sin((double)C * Math.PI / 180));
	}
}