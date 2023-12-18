import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int W = Integer.parseInt(data[0]);
		int H = Integer.parseInt(data[1]);
		int x = Integer.parseInt(data[2]);
		int y = Integer.parseInt(data[3]);
		int r = Integer.parseInt(data[4]);
		boolean judgment = false;

		if ((-100 <= x && x <= 100) && (-100 <= y && y <= 100)
				&& (0 < W && W <= 100) && (0 < H && H <= 100)
				&& (0 < r && r <= 100)) {

			if ((x + r) <= W) {
				if ((x - r) >= 0) {
					if ((y + r) <= H) {
						if ((y - r) >= 0) {
							judgment = true;
						}
					}
				}

			}

			if (judgment) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}

