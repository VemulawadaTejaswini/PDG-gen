import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n  = sc.nextDouble();
		double x  = sc.nextDouble();
		double t  = sc.nextDouble();

		int ans = (int) ((Math.ceil(n / x)) * t);
		System.out.println(ans);
		sc.close();
	}
}


