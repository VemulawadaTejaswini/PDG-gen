import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		
		double ans = 0;
		
		ans = n*m;
		long ans2 = (long)Math.floor(ans);
		
		System.out.println(ans2);
		

	}
}
