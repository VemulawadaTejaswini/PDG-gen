import java.util.*;
import java.text.*;

public class Main {
	static class Data{
		int x,y;
		public Data(int xx, int yy){
			x = xx;
			y = yy;
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if((w|h)==0) break;
			boolean[][] field = new boolean[h][w];
			int[][] counter = new int[h][w];
			int sx=0,sy=0;
			
			for(int i=0; i<h; i++){
				String str = in.next();
				char[] ch = str.toCharArray();
				for(int j=0; j<w; j++){
					counter[i][j] = 0;
					if(ch[j]=='#') field[i][j] = false;
					else{
						field[i][j] = true;
						if(ch[j] == '@'){
							sx = i;
							sy = j;
							counter[i][j] = 1;
						}
					}
				}
			}
			
			LinkedList<Data> queue = new LinkedList<Data>();
			queue.add(new Data(sx,sy));
			while(!queue.isEmpty()){
				Data now = queue.poll();
				if(now.x>0 && field[now.x-1][now.y] && counter[now.x-1][now.y]==0){
					counter[now.x-1][now.y]=1;
					queue.add(new Data(now.x-1,now.y));
				}
				if(now.y>0 && field[now.x][now.y-1] && counter[now.x][now.y-1]==0){
					counter[now.x][now.y-1]=1;
					queue.add(new Data(now.x,now.y-1));
				}
				if(now.x<h-1 && field[now.x+1][now.y] && counter[now.x+1][now.y]==0){
					counter[now.x+1][now.y]=1;
					queue.add(new Data(now.x+1,now.y));
				}
				if(now.y<w-1 && field[now.x][now.y+1] && counter[now.x][now.y+1]==0){
					counter[now.x][now.y+1]=1;
					queue.add(new Data(now.x,now.y+1));
				}
			}
			
			int ans = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					ans += counter[i][j];
				}
			}
			
			System.out.println(ans);
		}
	}
}