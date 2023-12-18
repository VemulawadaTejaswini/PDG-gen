import java.util.*;


public class Main {
	static class pair{
		int x,y;
		pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	static Queue<pair> q = new LinkedList<pair>();
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(),W = sc.nextInt(),N = sc.nextInt();
		String temp_in;
		char[][] field = new char[H+2][W+2];
		pair start = null;
		for(int i=0;i<W+2;i++){
			field[0][i] = 'X';
			field[H+1][i] = 'X';
		}
		for(int i=0;i<H+2;i++){
			field[i][0] = 'X';
			field[i][W+1] = 'X';
		}
		int[][] dis = new int[H+2][W+2];
		int[][] check = new int[H+2][W+2];
		for(int i=1;i<H+1;i++){
			temp_in = sc.next();
			for(int j=1;j<W+1;j++){
				field[i][j] = temp_in.charAt(j-1);
				if(field[i][j] == 'S') {
					start = new pair(i,j);
				}
				dis[i][j] = -1;
				check[i][j] = 0;
			}
		}
		q.add(start);
		check[start.x][start.y] = 1;
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		int level = 1, counter =0;
		while(!q.isEmpty()){
			pair p = q.poll();
			//System.out.println("size:"+q.size()+" level:"+level);
			int x = p.x, y = p.y;
			if(dis[x][y]==-1) dis[x][y] =0;
			
			String v_buf = String.valueOf(field[x][y]);
			if(Character.isDigit(field[x][y])&&Integer.parseInt(v_buf)<=level){
				//System.out.println(v);
				field[x][y] = '.';
				
				counter +=dis[x][y];
				if(level ==N) break;
				q.removeAll(q);
				for(int i=1;i<H+1;i++){
					for(int j=1;j<W+1;j++){
						dis[i][j] = -1;
						check[i][j] = 0;
 					}
				}
				pair new_p = new pair(x,y);
				check[x][y] = 1;
				q.add(new_p);
				level++;
			}else{
				for(int c=0;c<4;c++){
					if(field[x+dx[c]][y+dy[c]]!='X' && check[x+dx[c]][y+dy[c]]==0){
						dis[x+dx[c]][y+dy[c]]=dis[x][y]+1;
						pair temp_p = new pair(x+dx[c],y+dy[c]);
						q.add(temp_p);
						check[x+dx[c]][y+dy[c]] = 1;
					}
				}
			}
		}
		System.out.println(counter);
	}
}