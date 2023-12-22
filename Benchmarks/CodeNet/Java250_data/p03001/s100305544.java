import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble(), H = sc.nextDouble();
		double x = sc.nextDouble(), y = sc.nextDouble();
		boolean multi = (H % 2 == 0) && (W % 2 == 0) && (W / 2 == x) && (H / 2 == y);
		System.out.println((W * H) / 2.0 + " " + (multi ? 1 : 0));
	}
}