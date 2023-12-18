import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();

		String[] arrays = new String[H];

		for (int i = 0; i < H; i++) {
			arrays[i] = s.next();
		}
		
		for (int i = 0; i < H + 2; i++) {
			if (i == 0 || i == H + 1) {
				for (int j = 0; j < W + 2; j++) {
					System.out.print("#");
				}
			} else {
				System.out.print("#" + arrays[i - 1] + "#");

			}
			System.out.print("\n");
		}

	}

}
