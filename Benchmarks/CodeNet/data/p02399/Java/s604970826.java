import java.util.Scanner;

Class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt;
		int b = scan.nextInt;
		
		int d = a / b;
		int r = a % b;
		float f = a / Float.valueOf(b);
		
		System.out.println(String.Format("%d %d %f", d, r, f));
	}
}