import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = a;
		int sum = 0;
		
		while(a > 0) {
			sum += a % 10;
			a /= 10;
		}
		
		if(b % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}