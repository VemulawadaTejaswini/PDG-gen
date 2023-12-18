import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int area;

		while (sc.hasNext()) {
			n = sc.nextInt();
			area = 1;
			for (int i = 0; i < n; i++) {
				area = area + i + 1;
			}
			System.out.println(area);
		}
	}
}