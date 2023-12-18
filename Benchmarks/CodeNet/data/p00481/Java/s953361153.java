import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	static void init(int[][] md,int h,int w){
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				md[i][j]=10000;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int w = scan.nextInt();
		int n = scan.nextInt();
		int sx,sy;
		int[] gx = new int[n];
		int[] gy = new int[n];
		sx=sy=0;
		char[][] map = new char[h][w];
		for(int i=0;i<h;i++){
			map[i]= scan.next().toCharArray();
			for(int j=0;j<w;j++){
				if(map[i][j]=='S'){
					sx = j;
					sy = i;
				}
				if(Character.isDigit(map[i][j])){
					int k = Integer.parseInt(""+map[i][j])-1;
					gx[k] = j;
					gy[k] = i;
				}
			}
		}

		int[][] md = new int[h][w];
		init(md,h,w);

		int[] dx = {-1,0,1,0};
		int[] dy = {0,-1,0,1};

		LinkedList<Integer> que = new LinkedList<Integer>();

		que.offer(1);
		que.offer(sy);
		que.offer(sx);
		md[sy][sx]=0;

		while(!que.isEmpty()){
			int hp = que.poll();
			int y = que.poll();
			int x = que.poll();

			if(x==gx[hp-1] && y==gy[hp-1]){
				hp++;
				if(n<hp){
					System.out.println(md[y][x]);
					System.exit(0);
				}
				int p = md[y][x];
				init(md,h,w);
				que.clear();
				md[y][x]=p;
			}

			for(int i=0;i<4;i++){
				if(x+dx[i]>=0 && x+dx[i]<w && y+dy[i]>=0 && y+dy[i]<h){
					if(map[y+dy[i]][x+dx[i]]!='X' && md[y+dy[i]][x+dx[i]]>md[y][x]+1){
						que.offer(hp);
						que.offer(y+dy[i]);
						que.offer(x+dx[i]);
						md[y+dy[i]][x+dx[i]]=md[y][x]+1;
					}
				}
			}
		}
	}

}