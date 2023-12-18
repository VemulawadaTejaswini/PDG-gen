import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long a = Long.parseLong(scan.next());
		long b = Long.parseLong(scan.next());
		long k = Long.parseLong(scan.next());
		
		if(k <= a) {
			a -= k;
		} else if(a < k && k <= a + b) {
			b -= k - a;
			a = 0;
		} else if(a + b <= k) {
			a = 0;
			b = 0;
		}
		
		System.out.println(a + " " + b);	
		
		scan.close();
	}
}