import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		b = Math.max(Math.min(a + b - k, b), 0);
		a = Math.max(a - k, 0);
		
		System.out.println(a + " " + b);
		
		sc.close();
	}
	
}


