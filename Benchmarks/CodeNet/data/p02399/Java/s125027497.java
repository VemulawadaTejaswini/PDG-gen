import java.util.Scanner;
class Main {
	public void ab() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double f = 0;
		int d = a / b;
		int r = a % b;
		f = a * 1.0 / b;
		System.out.printf("%d %d %7f",d,r,f);
	}
	public static void main(String[] args) {
		new Main().ab();
	}
}