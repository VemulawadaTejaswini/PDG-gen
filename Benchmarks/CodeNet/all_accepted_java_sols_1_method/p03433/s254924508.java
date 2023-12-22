import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = n%500;
		if(b > a) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}