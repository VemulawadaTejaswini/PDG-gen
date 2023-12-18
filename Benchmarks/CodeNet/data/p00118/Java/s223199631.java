import java.util.*;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();
			
			ArrayDeque<int[]> q = new ArrayDeque<int[]>();
			int[] xy = new int[2];
			int cnt = 0;
			int x, y;
			char c = '.';
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]!='.'){
						cnt++;
						c = map[i][j];
						q.offer(new int[]{i, j});
						while(!q.isEmpty()){
							xy = q.poll();
							y = xy[0];
							x = xy[1];
							map[y][x] = '.';
							
							if(x!=0 && map[y][x-1]==c) q.offer(new int[]{y, x-1});
							if(x!=w-1 && map[y][x+1]==c) q.offer(new int[]{y, x+1});
							if(y!=0 && map[y-1][x]==c) q.offer(new int[]{y-1, x});
							if(y!=h-1 && map[y+1][x]==c) q.offer(new int[]{y+1, x});
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}	
}