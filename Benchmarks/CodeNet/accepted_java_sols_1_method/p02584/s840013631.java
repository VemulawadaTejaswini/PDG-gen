
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		
		if(x < 0) {
			x *= -1;
		}
		
		long div = x / d;
		
		if(div >= k) {
			System.out.println(x - k*d);
			return;
		}
		
		long remain = k - div;
		
		if(remain % 2 == 0) {
			System.out.println(x%d);
		}
		else {
			System.out.println(Math.abs(x%d - d));
		}
	}
}