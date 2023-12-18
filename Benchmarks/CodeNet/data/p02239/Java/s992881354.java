import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static boolean[][] graph=new boolean[101][101];
	static state[] step;
	static Queue <state> q;
	static int n;
	static class state{
		int x, minstep;
		state(int x){
			this.x=x;
			this.minstep=0;
		}
	}
	
	static void bfs() {
		while(! q.isEmpty()) {
			state p=q.remove();
			int x=p.x;
			for(int i=2; i<=n; i++) {
				if(graph[x][i] && step[i].minstep==0) {
					step[i].minstep=p.minstep+1;
					q.add(step[i]);
				}
			}
		}
	}
	
	public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		n=sc.nextInt();
    		step= new state[n+1];
    		for(int i=0; i<n; i++) {
    			int u=sc.nextInt();
    			int k=sc.nextInt();
    			for(int j=0; j<k; j++) {
    				int num=sc.nextInt();
    				graph[u][num]=true;
    			}
    		}
    		q = new LinkedList<>();
    		for(int x=1; x<=n; x++) {
    			step[x]=new state(x);
    		}
    		step[1].minstep=0;
    		q.add(step[1]);
    		bfs();
    		for(int i=0; i<n; i++) {
    			if(i+1!=1 && step[i+1].minstep==0) {
    				System.out.println(i+1+" "+"-1");
    			}
    			else
    			System.out.println(i+1+" "+step[i+1].minstep);
    		}
    	}
    }
}
