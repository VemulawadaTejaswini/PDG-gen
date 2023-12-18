
import java.io.*;
import java.util.*;
public class Main{
	static int X,Y,N;
	static int field[][];
	static boolean done[][];
	static final int[] dx = {1,0,-1,0};
	static final int[] dy = {0,1,0,-1};
	static int ans;
	static ArrayList<xy> S = new ArrayList<xy>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		String input[] = br.readLine().split(" +");
		Y = new Integer(input[0]);
		X = new Integer(input[1]);
		N = new Integer(input[2]);
		
		field = new int[X][Y];
		done = new boolean[X][Y];
		
		for(int y = 0; y < Y; y++){
			String str = br.readLine();
			for(int x = 0; x < X; x++){
				String a = str.substring(x, x+1);
				if(a.equals("S")){
					S.add(new xy(0,x,y,0));
				}else if(a.equals("X")){
					field[x][y] = -1;
				}else if(!a.equals(".")){
					S.add(new xy(new Integer(a),x,y,0));
				}
			}				
		}
		Collections.sort(S);
		
		ans = 0;
		for(int i = 0; i < S.size()-1; i++)
			ans += bfs(i);
		
		System.out.println(ans);
	}

	private static int bfs(int no) {
		ArrayDeque<xy> ad = new ArrayDeque<xy>();
		ad.add(S.get(no));
		xy end = S.get(no+1);
		
		for(int y = 0; y < Y; y++)
			for(int x = 0; x < X; x++)
				done[x][y] = false;
		
		while(!ad.isEmpty()){
			xy p = ad.poll();
			if(p.x == end.x & p.y == end.y)	
				return p.step;
			
			for(int i = 0; i < 4; i++){
				if(p.x+dx[i]<0 | p.x+dx[i]>=X) continue;
				if(p.y+dy[i]<0 | p.y+dy[i]>=Y) continue;
				if(done[p.x+dx[i]][p.y+dy[i]]) continue;
				if(field[p.x+dx[i]][p.y+dy[i]] < 0) continue;
				done[p.x+dx[i]][p.y+dy[i]] = true;
				ad.add(new xy(0, p.x+dx[i], p.y+dy[i], p.step+1));
			}
		}
		return -9999;
	}
}

class xy implements Comparable<xy>{
	int x,y,no;
	int step;
	xy(int no, int x, int y, int step){
		this.no = no;
		this.x = x;
		this.y = y;
		this.step = step;
	}
	public int compareTo(xy o) {
		return this.no - o.no;
	}
}