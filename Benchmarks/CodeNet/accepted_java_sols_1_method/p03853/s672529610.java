import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.nextLine().split(" ")[0]);

		for (int i = 0; i < h; i++) {
			String c = sc.nextLine();
			System.out.println(c + "\n" + c);
		}
		sc.close();
	}
}