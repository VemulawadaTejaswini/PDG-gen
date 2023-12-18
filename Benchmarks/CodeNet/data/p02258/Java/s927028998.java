import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = scan.nextInt();
		}
		int[][] rmax = new int[n-1][];
		for (int i = 0; i < n - 1; i++) {
			rmax[i] = new int[2];
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (flag == false) {
					rmax[i][0] = i;
					rmax[i][1] = j;
					flag = true;
				}
				if (r[j] - r[i] > r[rmax[i][1]] - r[rmax[i][0]]) {
					rmax[i][0] = i;
					rmax[i][1] = j;
				}
			}
		}
		int maxnum = r[rmax[0][1]] - r[rmax[0][0]];
		for (int i = 1; i < n - 1; i++) {
			int num = r[rmax[i][1]] - r[rmax[i][0]];
			if (maxnum < num) maxnum = num; 
		}
		System.out.println(maxnum);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}