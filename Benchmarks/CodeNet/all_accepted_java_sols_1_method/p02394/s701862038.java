import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] n = line.split(" ");
		int W = Integer.parseInt(n[0]);
		int H = Integer.parseInt(n[1]);
		int x = Integer.parseInt(n[2]);
		int y = Integer.parseInt(n[3]);
		int r = Integer.parseInt(n[4]);

		if (x - r < 0 || x + r > W || y - r < 0 || y + r > H) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}

