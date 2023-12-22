import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		if(n > k) {
			n -= k * (n/k);
			if(k -n < n) {
				System.out.println(k-n);
			}else {
				System.out.println(n);
			}
		}else {
			if(k -n < n) {
				System.out.println(k-n);
			}else {
				System.out.println(n);
			}
		}
	}
}