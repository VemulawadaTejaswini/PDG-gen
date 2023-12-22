import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = Math.max(a+b,a-b);
		x = Math.max(x, a*b);
		System.out.println(x);
	}
}
