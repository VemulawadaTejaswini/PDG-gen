import java.util.*;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int d = parseInt(sc.next());
		int[][] x = new int[n][d];
		for(i=0;i<n;i++) {
			for(j=0;j<d;j++) {
				x[i][j] = parseInt(sc.next());
			}
		}
		sc.close();
		int cnt=0;
		int NNMax = 126;
		int[] nn = new int[NNMax+1];
		for(i=1;i<=NNMax;i++) {
			nn[i] = i*i;
		}
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				int nnsum = 0;
				for(k=0;k<d;k++) {
					nnsum += (x[i][k] - x[j][k])*(x[i][k] - x[j][k]); 
				}
//				System.out.println(nnsum);
				for(k=1;k<=NNMax;k++) {
//					System.out.println(nn[k]);
					if(nn[k]==nnsum) {
						cnt++;
						break;
					}
					if(nn[k]>nnsum) {
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
