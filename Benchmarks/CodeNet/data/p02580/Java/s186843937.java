import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int q = sc.nextInt();
		int m=sc.nextInt();
		int[] hi = new int[m];
		int[] qi = new int[m];
		for (int i = 0; i < m; i++) {
			hi[i]=sc.nextInt()-1;
			qi[i]=sc.nextInt()-1;
		}
		int[] hcount = new int[h];
		int[] qcount = new int[q];
		for (int i = 0; i < h; i++) {
			for(int j=0;j<m;j++){
				if(hi[j]==i){hcount[i]++;}
			}
		}
		for (int i = 0; i < q; i++) {
			for(int j=0;j<m;j++){
				if(qi[j]==i){qcount[i]++;}
			}
		}
		int[][] ans = new int[h][q];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < q; j++) {
				ans[i][j]=hcount[i]+qcount[j];
			}
		}
		for(int i=0;i<m;i++){
			ans[hi[i]][qi[i]] =ans[hi[i]][qi[i]]-1;
		}
		int max=0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < q; j++) {
				if(max<ans[i][j]){max=ans[i][j];};
			}
		}
		System.out.println(""+max);
	}
}