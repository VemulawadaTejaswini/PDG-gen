import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(true) {
			int W = sc.nextInt();
			if(W == 0) break;
			int N = sc.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];

			String[] s = new String[2];
			for(int i=0;i<N;i++) {
				s = sc.next().split(",");
				v[i] = Integer.parseInt(s[0]);
				w[i] = Integer.parseInt(s[1]);
			}

			int[][] dpv = new int[N+1][W+1];
			int[][] dpw = new int[N+1][W+1];
			for(int i=0;i<=W;i++) {
				dpv[0][i] = 0;
				dpw[0][i] = 0;
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<=W;j++) {
					if(w[i] <= j) {
						dpv[i+1][j] = Math.max(dpv[i][j-w[i]] + v[i], dpv[i][j]);
						if((dpv[i][j-w[i]] + v[i]) == dpv[i][j]) {
							dpw[i+1][j] = Math.min(dpw[i][j-w[i]] + w[i], dpw[i][j]);
						}else if(Math.max(dpv[i][j-w[i]] + v[i], dpv[i][j]) == dpv[i][j-w[i]] + v[i]) {
							dpw[i+1][j] = dpw[i][j-w[i]] + w[i];
						}else {
							dpw[i+1][j] = dpw[i][j];
						}
					}else {
						dpv[i+1][j] = dpv[i][j];
						dpw[i+1][j] = dpw[i][j];
					}
				}
			}
//			for(int i=0;i<=N;i++) {
//				for(int j=0;j<=W;j++) {
//					System.out.print(dpv[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			for(int i=0;i<=N;i++) {
//				for(int j=0;j<=W;j++) {
//					System.out.print(dpw[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			System.out.println("Case" + " " + count + ":");
			System.out.println(dpv[N][W]);
			System.out.println(dpw[N][W]);
			count++;
		}
	}	
}



