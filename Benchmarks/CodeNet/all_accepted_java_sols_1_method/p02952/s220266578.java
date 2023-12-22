import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if (n<10) {
			System.out.println(n);
		}else if (n< 100) {
			System.out.println(9);
		}else if (n< 1000) {
			System.out.println(9+n-99);
		}else if (n< 10000) {
			System.out.println(909);
		}else if (n< 100000) {
			System.out.println(909+n-9999);
		}else {
			System.out.println(90909);
		}
		
		sc.close();
	}

}