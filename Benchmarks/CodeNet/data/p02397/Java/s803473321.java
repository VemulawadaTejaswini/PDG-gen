import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3001; i++) {
			String line = sc.nextLine();
			String[] a = line.split(" ");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			if (x == 0 && y == 0) {
				break;
			}
			if (x >= y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}
		}
	}
}