import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long sum = 0;
		for(long i = 1; i <= n; i++) {
			sum += i;
			if(sum % n == 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
	}

}