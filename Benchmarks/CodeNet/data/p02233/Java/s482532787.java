import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int fib0 = 0;
		int fib1 = 1;
		int fib = 0;
		
		for(i=0;i<n;i++) {
			fib = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib;
		}
		System.out.println(fib);
		sc.close();
	}

}

