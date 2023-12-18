import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][][] oh = new int[4][3][10];
		for (int i=0; i<n; i++) {
			int b = stdIn.nextInt()-1;
			int f = stdIn.nextInt()-1;
			int r = stdIn.nextInt()-1;
			int v = stdIn.nextInt();
			oh[b][f][r] += v;
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<10; k++) {
					System.out.print(" "+oh[i][j][k]);
				}
				System.out.println();
			}
			if(i<3)
				System.out.println("####################");
		}
	}
}