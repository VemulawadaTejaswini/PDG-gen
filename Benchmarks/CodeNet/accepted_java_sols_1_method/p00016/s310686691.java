
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R = 90;
		double x = 0, y = 0;
		while (scanner.hasNext()) {
			String str = scanner.next();
			String[] ab = str.split(",");
			if (Integer.parseInt(ab[0]) == 0 && Integer.parseInt(ab[1]) == 0) {
				System.out.println((int)x);
				System.out.println((int)y);
				break;
			}
			x += Integer.parseInt(ab[0]) * Math.cos(R * Math.PI / 180);
			y += Integer.parseInt(ab[0]) * Math.sin(R * Math.PI / 180);
			R -= Integer.parseInt(ab[1]);


		}
		scanner.close();
	}

}

