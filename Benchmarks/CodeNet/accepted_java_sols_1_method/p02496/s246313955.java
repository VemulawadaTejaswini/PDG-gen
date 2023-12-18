
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] data = new boolean[4][14];
		//0:spade 1:heart 2:club 3:diamond
		int times = sc.nextInt();
		for (int i = times; i > 0; i--) {
			char mark = sc.next().charAt(0);
			int rank = sc.nextInt();
			switch (mark) {
				case 'S':
					data[0][rank] = true;
					break;
				case 'H':
					data[1][rank] = true;
					break;
				case 'C':
					data[2][rank] = true;
					break;
				case 'D':
					data[3][rank] = true;
					break;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				if (!data[i][j]) {
					switch (i) {
						case 0:
							System.out.println("S " + j);
							break;
						case 1:
							System.out.println("H " + j);
							break;
						case 2:
							System.out.println("C " + j);
							break;
						case 3:
							System.out.println("D " + j);
							break;
					}
				}
			}
		}
	}
}