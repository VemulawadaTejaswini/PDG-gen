import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextInt();
		int d = sc.nextInt();
		
		int x = (int)Math.ceil(n / a);
		int y = (int)Math.ceil(n / c);
		
		System.out.println(Math.min(x * b, y * d));
	}
}
