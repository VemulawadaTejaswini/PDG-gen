import java.util.Scanner;

public class Main {
	static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b),c);
	}
	static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b),c);
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(min(a,b,c) + " " + max(a,b,c));
			
		}
	}
}
