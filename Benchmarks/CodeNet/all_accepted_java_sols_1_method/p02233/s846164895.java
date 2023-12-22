import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int fib = 1;
		int fibSub1 = 1;
		
		while(n > 1) {
			int temp = fib;
			fib = fib + fibSub1;
			fibSub1 = temp;
			n--;
		}
		
		System.out.println(fib);
	}

}

