import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] nums = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				int a = sc.nextInt();
				nums[i][k] = a;
			}
		}
		
		int[] vector = new int[m];
		for (int j = 0; j < m; j++) {
			int b = sc.nextInt();
			vector[j] = b;
		}

		for (int L = 0; L < n; L++) {
			int c = 0;
			for (int P = 0; P < m; P++) {
				c = nums[L][P] * vector[P] + c;
			}
			System.out.println(c);
		}
    }
}

