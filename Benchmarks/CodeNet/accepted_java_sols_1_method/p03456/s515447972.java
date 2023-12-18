import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String n = sc.next();
		int a = Integer.parseInt((s+n));
		if(Math.pow((int)Math.sqrt(a), 2)==a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}