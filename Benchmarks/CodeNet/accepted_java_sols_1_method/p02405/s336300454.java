import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (; sc.hasNext();) {

			int H = sc.nextInt();
			int W = sc.nextInt();

			if (H == 0 && W == 0) {
				break;
			}

			boolean flag = true;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (flag) {
						System.out.print("#");
						flag = false;
					} else {
						System.out.print(".");
						flag = true;
					}
				}
				System.out.println("");
				if (W % 2 == 0) {
					flag = !flag;
				}

			}
			System.out.println("");
			flag = true;
		}

	}

}

