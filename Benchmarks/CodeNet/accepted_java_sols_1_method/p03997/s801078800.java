import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();

		int area;
		if (a < b) {
			area = b * h - (b - a) * h / 2;
		} else {
			area = a * h - (a - b) * h / 2;
		}

		System.out.println(area);
		sc.close();
	}

}
