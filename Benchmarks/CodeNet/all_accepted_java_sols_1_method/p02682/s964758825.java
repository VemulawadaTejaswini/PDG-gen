import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		
		long sum = 0;
		
		
		if(k <= a) {
			System.out.println(k);
		}else if(k <= a + b) {
			System.out.println(a);
		}else if(k <= a + b + c) {
			System.out.println(a - ( k - a -b));
		}else {
			System.out.println((a -b));
		}
	}
}