import java.util.Scanner;
class Puz{
	Puz(int a[],int space,int path,int MD) {
		this.MD=MD;
		this.path=path;
		this.space=space;
		for(int i=0;i<a.length;i++)
			pic[i]=a[i];
	}
	public int[] pic = new int[16];
	public int path,MD,space;
	public int getX() {return this.space/4;}
	public int getY() {return this.space%4;}
	public void swap(int a,int b) {
		int tmp=this.pic[a];
		this.pic[a]=this.pic[b];
		this.pic[b]=tmp;
	}
}
public class Main { 
	private static final int N=4;
	private static final int NN=16;
	private static final int LIMIT =100;
	private static int[][] MDT = new int[NN][NN];
	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {1,0,-1,0};
	private static int lim;
	public static void getMD() {
		for(int i=0;i<NN;i++) {
			for(int j=0;j<NN;j++) {
				MDT[i][j]=Math.abs(i/N-j/N)+Math.abs(i%N-j%N);
			}
		}
	}
	public static boolean dfs(Puz cur,int dep,int prev){
		if(cur.MD==0) {
			System.out.println(cur.path);
			return true;
		}
		if(dep+cur.MD>lim) return false;
		int sx=cur.getX();
		int sy=cur.getY();
		for(int i=0;i<4;i++) {
			Puz tmp = new Puz(cur.pic,cur.space,cur.path,cur.MD);
			int tx=sx+dx[i];
			int ty=sy+dy[i];
			if(tx<0 || ty<0 || tx>=N || ty>=N) continue;
			if(Math.max(i,prev)-Math.min(i,prev)==2) continue;
			tmp.MD-=MDT[tx*N+ty][cur.pic[tx*N+ty]-1];
			tmp.MD+=MDT[sx*N+sy][cur.pic[tx*N+ty]-1];
			tmp.swap(sx*N+sy,tx*N+ty);
			tmp.space=tx*N+ty;
			tmp.path++;
			if(dfs(tmp,dep+1,i)){ 
				return true;
			}
		}
		return false;
	}
	public static void iterative(Puz in) {
		for(lim = in.MD;lim<=LIMIT;lim++) {
			if(dfs(in,0,-10)) return;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int space=0,sum=0;
		int org[] = new int[NN];
		getMD();
		for(int i=0;i<NN;i++) {
			org[i]=in.nextInt();
			if(org[i]==0) {
				org[i]=NN;
				space=i;
			}
			if(org[i]!=NN) sum+=MDT[i][org[i]-1];
		}
//		System.out.println(sum);
		Puz src = new Puz(org,space,0,sum);
		iterative(src);
		in.close();
	}

}

