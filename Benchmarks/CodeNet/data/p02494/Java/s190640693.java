import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		while ((w != 0) || (h != 0)) {
			if ((w == 0) && (h == 0)) {
				break;
			} else {
				for (int x = 0; x < h; x++) {
					for (int y = 0; y < w; y++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}
			w = sc.nextInt();
			h = sc.nextInt();
		}

	}

}