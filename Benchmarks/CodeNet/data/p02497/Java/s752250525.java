import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double m = sc.nextDouble();
			double f = sc.nextDouble();
			double r = sc.nextDouble();
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			if (m == -1 && f == -1) {
				System.out.println("F");
			}
			if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50 || (m + f >= 30 && r >= 50)) {
				System.out.println("C");
			} else if (m + f >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}