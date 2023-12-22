import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		
		long loop = n / (a+b);
		long mod = n % (a+b);
		
		if(mod > a) {
			System.out.println(loop*a+a);
		}else {
			System.out.println(loop*a+mod);
		}
		
	}
}
