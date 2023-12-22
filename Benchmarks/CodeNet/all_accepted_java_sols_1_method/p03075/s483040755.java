import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		if (b - a > k) {
			System.out.println(":(");
		} else if (c - a > k) {
			System.out.println(":(");
		} else if (d - a > k) {
			System.out.println(":(");
		} else if (e - a > k) {
			System.out.println(":(");
		} else if (c - b > k) {
			System.out.println(":(");
		} else if (d - b > k) {
			System.out.println(":(");
		} else if (e - b > k) {
			System.out.println(":(");
		} else if (d - c > k) {
			System.out.println(":(");
		} else if (e - c > k) {
			System.out.println(":(");
		} else if (e - d > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}