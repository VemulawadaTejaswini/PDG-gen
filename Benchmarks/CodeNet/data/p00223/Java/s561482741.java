import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class State{
		int tx,ty,kx,ky, cost;
		State(int tx,int ty,int kx, int ky, int cost){
			this.tx=tx;
			this.ty=ty;
			this.kx=kx;
			this.ky=ky;
			this.cost=cost;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int w=sc.nextInt();
				int h=sc.nextInt();
				if(w+h==0) break;
				int stx=sc.nextInt();
				int sty=sc.nextInt();
				int skx=sc.nextInt();
				int sky=sc.nextInt();
				int[][] field=new int[51][51];
				
				for(int i=1; i<=h; i++) {
					for(int j=1; j<=w; j++) {
						field[i][j]=sc.nextInt();
					}
				}
				
				Queue<State> q=new LinkedList<>();
				boolean[][][][] minstep=new boolean[51][51][51][51];
				int INF=100000000;
				int[] tdx= {1, 0, -1, 0};
				int[] tdy= {0, 1, 0, -1};
				int[] kdx= {-1, 0, 1, 0};
				int[] kdy= {0, -1, 0, 1};
				q.add(new State(stx, sty, skx, sky, 0));
				int ans=INF;
				
				while(!q.isEmpty()) {
					State state=q.poll();
					if(minstep[state.ty][state.tx][state.ky][state.kx]) continue;
					if(state.cost>=100) {
						ans=INF;
						break;
					}
					
					minstep[state.ty][state.tx][state.ky][state.kx]=true;
					if(state.tx==state.kx&&state.ty==state.ky) {
						ans=state.cost;
						break;
					}
					for(int i=0; i<4; i++) {
						int ntx=state.tx, nty=state.ty, nkx=state.kx, nky=state.ky;
						if(state.tx+tdx[i]>=1 && state.tx+tdx[i]<=w && state.ty+tdy[i]>=1 && state.ty+tdy[i]<=h && field[state.ty+tdy[i]][state.tx+tdx[i]]==0) {
							ntx=state.tx+tdx[i];
							nty=state.ty+tdy[i];
						}
						if(state.kx+kdx[i]>=1 && state.kx+kdx[i]<=w && state.ky+kdy[i]>=1 && state.ky+kdy[i]<=h && field[state.ky+kdy[i]][state.kx+kdx[i]]==0) {
							nkx=state.kx+kdx[i];
							nky=state.ky+kdy[i];
						}
						q.add(new State(ntx, nty, nkx, nky, state.cost+1));
					}
				}
				System.out.println(ans==INF? "NA":ans);
				q.clear();
			}
		}
	}
}
