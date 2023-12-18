import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		while ((h != 0) || (w != 0)) {
			if ((h == 0) && (w == 0)) {
				break;
			} else {
				for (int x = 1; x <= h; x++) {
					for (int y = 1; y <= w; y++) {
						if ((x == 1) || (x == h) || (y == 1) || (y == w)) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
					System.out.println();
				}
				h = sc.nextInt();
				w = sc.nextInt();
			}
		}

	}

}