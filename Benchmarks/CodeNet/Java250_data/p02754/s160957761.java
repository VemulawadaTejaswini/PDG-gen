import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long n = stdIn.nextLong();
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		
		long c = a + b;
		
		long cnt = n / c;
		
		if(n - cnt * c <= a) {
			System.out.println(cnt * a + (n - cnt * c));
		}else {
			System.out.println(cnt * a + a);
		}
		
		
	}

}
