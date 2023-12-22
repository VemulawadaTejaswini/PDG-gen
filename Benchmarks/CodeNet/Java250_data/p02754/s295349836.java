import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();

		long ans = (n / (a + b)) * a;
		long mod = n % (a + b);
		ans += Math.min(mod, a);

		System.out.println(ans);
	}
}
