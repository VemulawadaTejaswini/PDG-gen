
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double ans = 0;
		for(int i=0;i<n;i++) {
			ans+=(1.0/sc.nextDouble());
		}
		
	
		
		
		System.out.println(1.0/ans);
	}



}