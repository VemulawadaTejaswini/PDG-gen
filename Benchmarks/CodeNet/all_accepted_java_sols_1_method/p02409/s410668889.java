import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] r = new int[15][10];

		int info_num = sc.nextInt();
		for (int input_n = 0; input_n < info_num; input_n++) {

			int building = sc.nextInt() - 1;
			int floor = sc.nextInt() - 1;
			int room = sc.nextInt() - 1;
			int value = sc.nextInt();

			r[building * 4 + (floor)][room] += value;
		}

		for (int tate = 0; tate < 4; tate++) {
			for (int k = 0; k < 3; k++) {
				for (int j = 0; j < 10; j++) {

					System.out.print(" " + r[tate * 4 + k][j]);
				}
				System.out.println("");

			}
			if (tate != 3)
				System.out.println("####################");
		}

	}
}

