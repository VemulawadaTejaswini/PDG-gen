import java.util.Scanner;
class Main {
	public void ci() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double S = r * 1.0 * r * 1.0 * 3.141592653589;
		double V = 2 * 1.0 * r * 1.0 * 3.141592653589;
		System.out.printf("%7f %7f",S,V);
	}
	public static void main(String[] args) {
		new Main().ci();
	}
}