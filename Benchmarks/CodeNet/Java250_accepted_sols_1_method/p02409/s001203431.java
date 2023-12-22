import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// [house] [floor] [room]
		int[][][] bldgs = new int[4][3][10];

		for (int b, f, r, v, i = 0; i < n; i++) {
			b = sc.nextInt() - 1;
			f = sc.nextInt() - 1;
			r = sc.nextInt() - 1;
			v = sc.nextInt();
			bldgs[b][f][r] += v;
		}

		sc.close();

		StringBuilder sb = new StringBuilder();
		boolean flag = true;;
		
		for (int[][] f : bldgs) {
			if (flag) flag = false;
			else sb.append("####################\n");
			
			for (int[] r : f) {
				for (int v : r) {
					sb.append(" ").append(v);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}