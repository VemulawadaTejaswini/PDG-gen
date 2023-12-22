import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		List<int[]> listlr =  new ArrayList<>();
		List<int[]> listpq = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int[] lr = new int[2];
			lr[0] = in.nextInt()-1;
			lr[1] = in.nextInt()-1;
			listlr.add(lr);
		}
		for(int i=0;i<q;i++) {
			int[] pq = new int[2];
			pq[0] = in.nextInt()-1;
			pq[1] = in.nextInt()-1;
			listpq.add(pq);
		}
		
		int[][] t = new int[n][n];
		
		for(int[] lr:listlr) {
			t[lr[0]][lr[1]]++;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=i-1;j>=0;j--) {
				t[j][i] = t[j][i] + t[j+1][i];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				t[i][j] = t[i][j] + t[i][j-1];
			}
		}
		
		
		for(int[] pq:listpq) {
			System.out.println(t[pq[0]][pq[1]]);
		}
		
		in.close();

	}

}
