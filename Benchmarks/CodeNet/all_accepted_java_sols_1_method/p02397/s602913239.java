import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				int x = Integer.parseInt(sc.next());
				int y = Integer.parseInt(sc.next());
				if (x == 0 && y == 0) {
					break;
				} else if (x < y) {
					System.out.println(x + " " + y);
				} else {
					System.out.println(y + " " + x);
				}
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}