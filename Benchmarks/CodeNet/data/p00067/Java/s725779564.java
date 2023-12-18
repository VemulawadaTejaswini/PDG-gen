import java.util.Scanner;



public class Main {
	final int N = 12;
	final int[][] ofs = {
			{1, 0}, {0,-1}, {-1, 0}, {0, 1}
	};
	void del(boolean[][] map, int y, int x){
		map[y][x] = false;
		for(int i=0; i<4; ++i){
			int nx = x + ofs[i][0];
			int ny = y + ofs[i][1];
			if(0<=ny && ny<N && 0<=nx && nx<N){
				if(map[ny][nx]){
					del(map, ny, nx);
				}
			}
		}
	}
	
	int solve(boolean map[][]){
		int c = 0;
		
		for(int y=0; y<N; ++y){
			for(int x=0; x<N; ++x){
				if(map[y][x]){
					c++;
					del(map, y, x);
				}
			}
		}
		
		return c;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char[][] str = new char[N][N];
			for(int i=0; i<N; ++i){
				str[i] = sc.nextLine().toCharArray();
			}
			
			boolean[][] map = new boolean[N][N];
			for(int y=0; y<N; ++y){
				for(int x=0; x<N; ++x){
					map[y][x] = str[y][x]=='1';
				}
			}
			
			System.out.println(solve(map));
			if(sc.hasNext()){ sc.nextLine(); }//から読み
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}