import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][][] ar = new int[4][3][10];
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int b = sc.nextInt(); int f = sc.nextInt(); int r = sc.nextInt(); int v = sc.nextInt();
			ar[b-1][f-1][r-1] += v;
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				StringBuilder sb = new StringBuilder();
				for (int k=0; k<10; k++) {
					sb.append(" "+ar[i][j][k]);
				}
				System.out.println(sb);
			}
			if (i!=3) System.out.println("####################");
		}
	}
}
