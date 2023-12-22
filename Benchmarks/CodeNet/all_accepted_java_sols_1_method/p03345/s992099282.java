import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long tempA = a;
		long tempB = b;
		long tempC = c;

		if(a-b > 1000000000000000000L || b-a>1000000000000000000L) {
			System.out.println("Unfair");
		}else {
			if(k%2==0) {
				System.out.println(a-b);
			}else {
				System.out.println(b-a);
			}
			}
		}

}
