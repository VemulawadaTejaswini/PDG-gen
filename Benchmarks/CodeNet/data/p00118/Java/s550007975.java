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
			
			ArrayDeque<Integer> p = new ArrayDeque<Integer>();
			ArrayDeque<Integer> q = new ArrayDeque<Integer>();
			int count = 0;
			char c = '.';
			int x, y;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]!='.'){
						count++;
						c = map[i][j];
						p.offer(j);
						q.offer(i);
						while(p.size()!=0){
							x = p.poll();
							y = q.poll();
							map[y][x] = '.';
							
							if(x!=0 && map[y][x-1]==c){
								p.offer(x-1);
								q.offer(y);
							}
							if(x!=w-1 && map[y][x+1]==c){
								p.offer(x+1);
								q.offer(y);
							}
							if(y!=0 && map[y-1][x]==c){
								p.offer(x);
								q.offer(y-1);
							}
							if(y!=h-1 && map[y+1][x]==c){
								p.offer(x);
								q.offer(y+1);
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}	
}