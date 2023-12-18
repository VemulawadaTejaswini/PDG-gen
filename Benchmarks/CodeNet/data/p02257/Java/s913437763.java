import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			count += isprime(x);
		}
		
		scan.close();
		System.out.println(count);
	}
	
	public static int isprime(int x) {
		
		if (x == 2) return 1;
		
		if (x < 2 || x % 2 == 0) return 0;
		
		int i = 3;
		
		while ( i <= Math.sqrt((double)x)) {
			if (x % i == 0) return 0;
			
			i += 2;
		}
		
		return 0;
	}
}

