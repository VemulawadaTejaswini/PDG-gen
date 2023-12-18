import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		System.out.println(factorial(a));
		System.exit(0);
	}
	static int factorial(int i){
		return i == 0 ? 1 : i * factorial(i - 1);
	}
}