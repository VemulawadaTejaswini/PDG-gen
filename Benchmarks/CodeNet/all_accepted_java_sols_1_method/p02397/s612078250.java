import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int rows = 3000;
		int columns = 2;
		int count = 0;
		Scanner s = new Scanner(System.in);
		int[][] sort = new int[rows][columns];
		int temp;

		for (int i = 0; i < 3000; i++) {
			sort[i][0] = s.nextInt();
			sort[i][1] = s.nextInt();
			if (sort[i][0] >= 0 && sort[i][1] >= 0 && sort[i][0] <= 10000 && sort[i][1] <= 10000) {
				if (sort[i][0] > sort[i][1]) {
					temp = sort[i][0];
					sort[i][0] = sort[i][1];
					sort[i][1] = temp;
				}
				if (sort[i][0] == 0 && sort[i][1] == 0) {
					count = i;
					break;
				}

			}
		}

		for (int a = 0; a < count; a++) {
			System.out.println(sort[a][0] + " " +sort[a][1]);
		}
	}
}