
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int m = n % 500;
		
		long ans =(long)1000* (n / 500) + (m/5) * 5 ;
		
		System.out.println(ans);
	}

}
