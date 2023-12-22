import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
long h = scan.nextLong();
		
		long sum = 1;
		long x = 2;
		
		while (h != 0) {
			sum += x;
			x*=2;
			h/=2;
		}
		x/=2;
		sum -=x;
		
		System.out.println(sum);
	}
}