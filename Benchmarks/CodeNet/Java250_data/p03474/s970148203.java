import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String N = sc.next();
		int length = N.length();
		for (int i = 0; i < length; i++) {
			char c = N.charAt(i);
			if (i == A) {
				if (c != '-') {
					System.out.println("No"); 
					return;
				}
			} else {
				if (c < '0' || c > '9') {
					System.out.println("No"); 
					return;
				}
			}
		}
		System.out.println("Yes"); 
	}
}