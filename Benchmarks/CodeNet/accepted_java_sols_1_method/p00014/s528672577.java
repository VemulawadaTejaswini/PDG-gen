import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			int area = 0;
			int d = scan.nextInt();
			for (int i = 0; i * d < 600; i++) {
				area = area + (d * (d * i) * (d * i));
			}
			System.out.println(area);
		}
	}
}