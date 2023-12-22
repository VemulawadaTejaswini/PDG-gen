import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int D = in.nextInt();
		int[][] table = new int[H*W+1][2];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int num = in.nextInt();
				table[num][0] = i;
				table[num][1] = j;
			}
		}
		int[] cost = new int[H*W+1];
		for(int i=D+1;i<=2*D;i++) {
			int j = i;
			while(j<=H*W) {
				cost[j] = cost[j-D] + Math.abs(table[j][0]-table[j-D][0]) + Math.abs(table[j][1]-table[j-D][1]);
				j += D;
			}
		}
		int Q = in.nextInt();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for(int i=0;i<Q;i++) {
			l[i] = in.nextInt();
			r[i] = in.nextInt();
		}
		in.close();
		for(int i=0;i<Q;i++) {
			System.out.println(cost[r[i]]-cost[l[i]]);
		}
	}

}
