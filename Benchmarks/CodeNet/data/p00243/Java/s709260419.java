import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int x, y;
	static int[][] c;
	static class State{
		int color, minstep;
		int[][] field=new int[y][x];
		State(int color, int[][] field, int minstep){
			this.color=color;
			for(int i=0; i<y; i++) {
				for(int j=0; j<x; j++) {
					this.field[i][j]=field[i][j];
				}
			}
			this.minstep=minstep;
		}
	}
	
	static void Copy(int[][] b) {
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				c[i][j]=b[i][j];
			}
		}
	}
	static void dfs(int w, int h, int pre, int now) {
		int[] dx= {1, 0, -1, 0};
		int[] dy= {0, 1, 0, -1};
		c[h][w]=now;
		for(int i=0; i<4; i++) {
			if(w+dx[i]<0 || w+dx[i]>=x || h+dy[i]<0 || h+dy[i]>=y) continue;
			if(c[h+dy[i]][w+dx[i]]!=pre) 	continue;
			dfs(w+dx[i], h+dy[i], pre, now);
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				x=sc.nextInt();
				y=sc.nextInt();
				if(x+y==0) break;
				c=new int[y][x];
				for(int i=0; i<y; i++) {
					for(int j=0; j<x; j++) {
						String s=sc.next();
						if(s.equals("R")) {
							c[i][j]=1;
						}else if(s.equals("G")) {
							c[i][j]=2;
						}else {
							c[i][j]=3;
						}
					}
				}
				Queue<State> q=new LinkedList<>();
				//int[][] copy=new int[y][x];
				
				q.add(new State(c[0][0], c, 0));
				int count=0;
				Map<String, Integer> map=new HashMap<>();
				while(!q.isEmpty()) {
					State s=q.poll();
					boolean tf=true;
					String str="";
					for(int i=0; i<y; i++) {
						for(int j=0; j<x; j++) {
							str+=String.valueOf(s.field[i][j]);
							if(s.field[0][0]!=s.field[i][j]) {
								tf=false; 
							}
						}
					}
					if(tf) {
						count=s.minstep;
						break;
					}
					if(map.containsKey(str)) continue;
					map.put(str, s.minstep);
					
					for(int i=1; i<=3; i++) {
						if(s.color==i) continue;
						Copy(s.field);
						dfs(0, 0, s.color,i);
						q.add(new State(i, c, s.minstep+1));
					}
				}
				System.out.println(count);
			}

		}
	}
}
