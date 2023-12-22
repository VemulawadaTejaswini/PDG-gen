import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());


		if(k >=  a + b) {
			a = 0;
			b = 0;
		}else if(k >= a) {
			k -= a;
			a = 0;
			b -= k;
		}else {
			a -= k;
		}
		
		
		System.out.println(a + " " + b);	}
}