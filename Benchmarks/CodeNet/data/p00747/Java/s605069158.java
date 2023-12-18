import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;



public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			System.gc();
			String[] tmpArray = br.readLine().split(" ");
			
			int w = Integer.parseInt(tmpArray[0]);
			int h = Integer.parseInt(tmpArray[1]);
			
			if(w == 0 && h == 0){
				break;
			}
			
			Tile tiles[][] = new Tile[h][w];
			
			for(int i = 0; i < h ; i++){
				for(int j = 0; j < w; j++){
					tiles[i][j] = new Tile(j, i);
				}
			}
			
			//一番上の行の上部は入り口以外壁
			for(int i = 1; i < w; i++){
				tiles[0][i].walls[Tile.TOP] = true;
			}
			
			for(int i = 0; i < 2*h - 1 ; i++){
				//左右
				if(i % 2 == 0){
					tiles[i/2][0].walls[Tile.LEFT] = true;
					tmpArray = br.readLine().substring(1).split(" ");
					for(int j = 0; j < tmpArray.length; j++){
						if(tmpArray[j].equals("1")){
							tiles[i/2][j].walls[Tile.RIGHT] = true;
//							System.out.println("RIGHT of ["+(i/2)+"]["+(j)+"]");
							tiles[i/2][j + 1].walls[Tile.LEFT] = true;
//							System.out.println("LEFT of ["+(i/2)+"]["+(j + 1)+"]");
							
						}
					}
					tiles[i/2][w - 1].walls[Tile.RIGHT] = true;
				}
				//上下
				else {
					tmpArray = br.readLine().split(" ");
					for(int j = 0; j < tmpArray.length; j++){
						if(tmpArray[j].equals("1")){
							tiles[i/2][j].walls[Tile.BOTTOM] = true;
//							System.out.println("BOTTOM of ["+(i/2)+"]["+(j)+"]");
							tiles[i/2 + 1][j].walls[Tile.TOP] = true;
//							System.out.println("TOP of ["+(i/2 + 1)+"]["+(j)+"]");
							
						}
					}
				}
			}
			
			//一番下の行の下部は出口以外壁
			for(int i = 0; i < w - 1; i++){
				tiles[h - 1][i].walls[Tile.BOTTOM] = true;
			}
			
			System.out.println(solve(tiles, w, h));
		}
	}
	
	//bfsでやってみる
	static int solve(Tile tiles[][], int w, int h) throws InterruptedException{
//		int result = 1;
		
//		PriorityQueue<Tile> queue = new PriorityQueue<Tile>();
		LinkedList<Tile> queue = new LinkedList<Tile>();
		tiles[0][0].visited = true;
		tiles[0][0].dist = 1;
		queue.add(tiles[0][0]);
		
		while(!queue.isEmpty()){
			Tile tmpTile = queue.poll();
			tmpTile.visited = true;
			int x = tmpTile.x;
			int y = tmpTile.y;
//			System.out.println("pop x "+x+" y "+ y);
			
			if(x == w - 1 && y == h - 1){
				return tmpTile.dist;
			}
			 
			//上
			if(y != 0 && !tmpTile.walls[Tile.TOP] && !tiles[y - 1][x].visited){
				tiles[y - 1][x].dist = tmpTile.dist + 1;
				queue.add(tiles[y - 1][x]);
			}
			//下
			if(y != h - 1 && !tmpTile.walls[Tile.BOTTOM] && !tiles[y + 1][x].visited){
				tiles[y + 1][x].dist = tmpTile.dist + 1;
				queue.add(tiles[y + 1][x]);
			}
			//左
			if(x != 0 && !tmpTile.walls[Tile.LEFT] && !tiles[y][x - 1].visited){
				tiles[y][x - 1].dist = tmpTile.dist + 1;
				queue.add(tiles[y][x - 1]);
			}
			//右
			if(x != w - 1 && !tmpTile.walls[Tile.RIGHT] && !tiles[y][x + 1].visited){
				tiles[y][x + 1].dist = tmpTile.dist + 1;
				queue.add(tiles[y][x + 1]);
			}
			
//			result++;
//			System.out.println("dist = "+result+" size of queue "+queue.size());
		}
		
		return 0;
	}

}

class Tile implements Comparable<Tile>{
	static final int TOP = 0;
	static final int LEFT = 1;
	static final int BOTTOM = 2;
	static final int RIGHT = 3;
	
	boolean walls[] = new boolean[4];
	boolean visited = false;
	
	int x;
	int y;
	int dist;
	
	public Tile(int x, int y){
		Arrays.fill(walls, false);
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Tile t) {
		return this.dist - t.dist;
	}
}
