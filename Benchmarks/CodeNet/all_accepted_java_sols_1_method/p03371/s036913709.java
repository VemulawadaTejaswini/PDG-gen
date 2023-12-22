import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = sc.nextLine().split(" ");
		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);
		int c = Integer.parseInt(lines[2]);
		int x = Integer.parseInt(lines[3]);
		int y = Integer.parseInt(lines[4]);
		sc.close();

		int min = 0;
		if (a+b <= 2*c) {
			min = a*x+b*y;
		} else {
			if (x > y) {
				min += 2*c*y;
				if (a<=2*c) {
					min += a*(x-y);
				} else {
					min += 2*c*(x-y);
				}
			} else {
				min += 2*c*x;
				if (b<=2*c) {
					min += b*(y-x);
				} else {
					min += 2*c*(y-x);
				}
			}
		}
		System.out.println(min);
	}
}
