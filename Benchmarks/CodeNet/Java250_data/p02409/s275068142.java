import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
 		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][] nums = new int[4][3][10];
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			nums[b - 1][f - 1][r - 1] = nums[b - 1][f - 1][r - 1] + v;
		}
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 3; k++) {
				for (int L = 0; L < 10; L++) {
					System.out.print(" ");
					System.out.print(nums[j][k][L]);
				}
				System.out.println();
			}
			if (j < 3) {
				System.out.println("####################");
			}
		}
    }
}

