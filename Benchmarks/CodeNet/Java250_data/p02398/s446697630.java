import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int n = 0;
		
		while(a < 1 || a > 10000 || b < 1 || b> 10000 || c < 1 || c > 10000) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();
		}
		
		for(int i = a; i <= b; i++) {
			if(c % i == 0) {
				n++;
			}
		}
		
		System.out.println(n);
	}
}
