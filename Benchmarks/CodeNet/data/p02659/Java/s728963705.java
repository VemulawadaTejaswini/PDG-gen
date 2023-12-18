import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = Math.floor(a*b);
		long ans = (long) result;
		System.out.println(ans);
 
	}
}