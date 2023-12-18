import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			int q = stdIn.nextInt();
			if(n == 0 && m == 0 && q == 0) break;
			String[] S = new String[q];
			String[] B = new String[q];
			for(int i = 0; i < q; i++) {
				S[i] = stdIn.next();
				B[i] = stdIn.next();
			}
			boolean[][] SX = new boolean[q][n];
			boolean[][] BX = new boolean[q][m];
			for(int i = 0; i < q; i++) {
				for(int j = 0; j < n; j++) {
					SX[i][j] = (S[i].charAt(j) == '1')?true:false;
				}
				for(int j = 0; j < m; j++) {
					BX[i][j] = (B[i].charAt(j) == '1')?true:false;
				}
				if(i != 0) {
					for(int j = 0; j < n; j++) {
						SX[i][j] = (S[i].charAt(j) == '1')?!SX[i-1][j]:SX[i-1][j];
					}
					for(int j = 0; j < m; j++) {
						BX[i][j] = (B[i].charAt(j) == '1')?true:false;
					}
				}
			}
			int[] ans = new int[m];
			for(int i = 0; i < m; i++) {
				ans[i] = -1;
			}
			boolean[] already = new boolean[n];
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < q; j++) {
					int Tid = 0;
					int Fid = 0;
					int Tcount = 0;
					int Fcount = 0;
					for(int k = 0; k < n; k++) {
						if(SX[j][k] && !already[k]) {
							Tcount++;
							Tid = k;
						}
						if(!SX[j][k] && !already[k]) {
							Fcount++;
							Fid = k;
						}
					}
					if(Tcount == 1) {
						for(int k = 0; k < m; k++) {
							already[Tid] = true;
							if(BX[j][k] && ans[k] == -1) {
								ans[k] = Tid+1;
							}
						}
					}
					if(Fcount == 1) {
						for(int k = 0; k < m; k++) {
							already[Fid] = true;
							if(!BX[j][k] && ans[k] == -1) {
								ans[k] = Fid+1;
							}
						}
					}
				}
			}
			if(n == 1 && m == 1) {
				System.out.println(0);
				continue;
			}
			for(int i = 0; i < ans.length; i++) {
				if(ans[i] == -1) {
					System.out.print("?");
				}
				else if(ans[i] <= 10) {
					char a = '0';
					a += ans[i]-1;
					System.out.print(a);
				}
				else {
					char a = 'A';
					a += (ans[i] - 11);
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}