import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int box1 = a - b;
		int d = c - box1;

		if (box1 > c) {
			System.out.println("0");
		} else {
			System.out.println(d);
		}
		sc.close();
	}
}