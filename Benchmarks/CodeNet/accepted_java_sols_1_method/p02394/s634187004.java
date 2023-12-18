import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] i = sc.nextLine().split(" ");
		int w = Integer.parseInt(i[0]);
		int h = Integer.parseInt(i[1]);
		int x = Integer.parseInt(i[2]);
		int y = Integer.parseInt(i[3]);
		int r = Integer.parseInt(i[4]);

		if (x - r < 0 || x + r > w || y - r < 0 || y + r > h) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}