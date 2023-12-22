import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i = (int)Math.sqrt(n);
		while(true) {
			if(n%i==0) {
				System.out.println(i + n/i -2);
				break;
			} else {
				i--;
			}
		}
	}

}
