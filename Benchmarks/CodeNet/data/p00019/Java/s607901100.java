import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		System.out.println(f(n));
	}
	
	static long f(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * f(n-1);
		}
	}
}