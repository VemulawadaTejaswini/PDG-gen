import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if(m <= 2*n) {
			System.out.println(m/2);
		}else {
			System.out.println(n + (m-2*n)/4);
		}
	}
}
