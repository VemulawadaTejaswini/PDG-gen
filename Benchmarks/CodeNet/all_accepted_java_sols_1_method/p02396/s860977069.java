import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int times = 1;
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				int x = Integer.parseInt(sc.next());
				if (x == 0) {
					break;
				} else {
					System.out.println("Case " + times + ": " + x);
					times += 1;
				}
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}