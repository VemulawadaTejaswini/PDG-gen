import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		
		while (n-500 > 0) {
			n = n-500;
		}
		if (n<500 && a<n) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
