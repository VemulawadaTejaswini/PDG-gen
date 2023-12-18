import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		long a = Integer.parseInt(scan.next());
		System.out.println(factorial(a));
		System.exit(0);
	}
	static long factorial(long i){
		return i == 0 ? 1 : i * factorial(i - 1);
	}
}