import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r == 0 && c == 0) break;
			int[][] status = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					status[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i < 1 << r; i++) {
				int presum = 0;
				for (int j = 0; j < r; j++) {
					if ((i & 1 << j) != 0) {
						for (int k = 0; k < c; k++) {
							status[j][k] = (status[j][k] == 1) ? 0 : 1;
						}
					}
				}

				for (int j = 0; j < c; j++) {
					int sum = 0;
					for (int k = 0; k < r; k++) {
						status[k][j] = (status[k][j] == 1) ? 0 : 1;
					}
					for (int k = 0; k < r; k++) {
						sum += (status[k][j] == 1) ? 0 : 1;
					}
					int sum2 = 0;
					for (int k = 0; k < r; k++) {
						status[k][j] = (status[k][j] == 1) ? 0 : 1;
					}
					for (int k = 0; k < r; k++) {
						sum2 += (status[k][j] == 1) ? 0 : 1;
					}
					presum += Math.max(sum, sum2);
				}
				max = Math.max(max, presum);
				for (int j = 0; j < r; j++) {
					if ((i & 1 << j) != 0) {
						for (int k = 0; k < c; k++) {
							status[j][k] = (status[j][k] == 1) ? 0 : 1;
						}
					}
				}

			}
			System.out.println(max);
		}
	}

	
}