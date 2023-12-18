import java.util.*;
public class Main {

	static int max,d,w;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			d=in.nextInt();w=in.nextInt();
			if(d==0)break;
			int G[][]=new int[d][w]; max=0;
			for(int i=0;i<d;i++) {
				for(int j=0;j<w;j++)G[i][j]=Integer.parseInt(in.next());
			}
			
			for(int i=0;i<=d-3;i++) {
				for(int j=0;j<=w-3;j++)solve(G,i,j,3,3);
			}
			System.out.println(max);
		}
	}
	
	static void solve(int[][] A,int y,int x,int dep,int wid) {
		if(y+dep>d || x+wid>w)return;
		//int g[][]=new int[dep-y-2][wid-x-2];
		int edgmin=9,lkmax=0,maxv=0;
		for(int i=y;i<dep+y;i++) {
			for(int j=x;j<wid+x;j++) {
				if(i==y || i==dep+y-1 || j==x || j==wid+x-1)edgmin=Math.min(edgmin,A[i][j]);
				else {
					//maxv+=A[i][j];
					lkmax=Math.max(lkmax, A[i][j]);
				}
			}
		}
		if(edgmin>lkmax) {
			for(int i=y+1;i<dep+y-1;i++) {
				for(int j=x+1;j<x+wid-1;j++)maxv+=edgmin-A[i][j];
			}
		}
		//System.out.printf("y=%d x=%d dep=%d wid=%d edge=%d lake=%d sum=%d\n",y,x,dep,wid,edgmin,lkmax,maxv);
		max=Math.max(max, maxv);
		solve(A,y,x,dep+1,wid);
		solve(A,y,x,dep,wid+1);
	}

}

