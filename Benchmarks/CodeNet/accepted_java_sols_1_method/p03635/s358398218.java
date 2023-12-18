import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();

		/*if((a+b)%3==0 || a%3==0 || b%3==0) {
			System.out.println("Possible");
		}else {
			System.out.println("Impossible");
		}*/
		System.out.println((n-1)*(m-1));
	}
}


