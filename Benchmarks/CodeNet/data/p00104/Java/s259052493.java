import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int height = Integer.parseInt(tmpArray[0]);
			int width = Integer.parseInt(tmpArray[1]);

			if(height == 0&&width==0){
				break;
			}

			//??????????????±??????
			Tiles tiles = new Tiles(height, width);
			for(int i = 0; i < height; i++){
				String tmpStr = br.readLine();
				for(int j = 0; j < width ; j++){
					tiles.setTile(new Tile(tmpStr.charAt(j)), i, j);
				}
			}

			if(!tiles.move()){
				System.out.println("LOOP");
			}
			else {
				tiles.move();
			}
		}
	}

}

class Tiles {
	private Tile[][] tiles;
	private int curX;
	private int curY;

	public Tiles(int h, int w){
		tiles = new Tile[h][w];
		curX = 0;
		curY = 0;
	}

	public void setTile(Tile t, int y, int x){
		tiles[y][x] = t;
	}

	public boolean move(){
		while(true){
			//rintPosition();
			char type = tiles[curY][curX].getType();

			if(type == '>'){
				curX++;
			}
			else if(type == '<'){
				curX--;
			}
			else if(type == '^'){
				curY--;
			}
			else if(type == 'v'){
				curY++;
			}
			else {
				break;
			}

			if(tiles[curY][curX].hasGone()){
				return false;
			}

			tiles[curY][curX].setGone(true);
		}

		return true;
	}

	public void printPosition(){
		System.out.println(curX+" "+curY);
	}
}

class Tile {
	private char type;
	private boolean gone;

	public Tile(char type){
		this.type = type;
	}

	public char getType(){
		return type;
	}

	public void setGone(boolean gone){
		this.gone = gone;
	}

	public boolean hasGone(){
		return gone;
	}
}