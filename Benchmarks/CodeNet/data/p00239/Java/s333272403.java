import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[][] data = new int[n][5];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++) {
					data[i][j] = sc.nextInt();
				}
				data[i][4] = data[i][1] * 4 + data[i][2] * 9 + data[i][3] * 4;
			}
			int[] lim = new int[5];
			for (int i = 1; i < 5; i++)
				lim[i] = sc.nextInt();
			boolean naflag = true;
			for (int i = 0; i < n; i++) {
				boolean flag = true;
				for (int j = 1; j < 4; j++) {
					if (data[i][j] > lim[j])
						flag = false;
				}
				if (data[i][4] > lim[4])
					flag = false;
				if (flag) {
					naflag = false;
					System.out.println(data[i][0]);
				}
			}
			if (naflag)
				System.out.println("NA");
		}
	}
}