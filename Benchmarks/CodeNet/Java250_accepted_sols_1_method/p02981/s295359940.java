import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n, a,b;
		n = s.nextInt();
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(Math.min(n*a,b));
	}
}
