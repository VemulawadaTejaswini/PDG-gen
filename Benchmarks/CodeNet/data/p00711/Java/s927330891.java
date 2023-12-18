import java.util.Scanner;

public class Main{
    static int count=0;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int w = 0,h = 0,sx = 0,sy = 0;
	char[][] tiles;
	
	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;

	    tiles = new char[h][];

	    for(int i = 0;i<h;i++){
		tiles[i] = sc.next().toCharArray();
	    }
	    
	    for(int i = 0;i<tiles.length;i++){
		for(int j = 0;j<tiles[i].length;j++){
		    if(tiles[i][j]=='@'){ sy=i; sx=j;}
		}
	    }
	    
	    goTiles(sy,sx,tiles);
	    System.out.println(count);
	    count=0;
	}
    }
    public static void goTiles(int y,int x,char[][] tiles){
	if(y>=tiles.length || y<0) return;
	if(x>=tiles[y].length || x<0) return;
	if(tiles[y][x]=='#' || tiles[y][x]=='N') return;
	
	count++;
	tiles[y][x] = 'N';
	//System.out.println("now: "+y+","+x+" count: "+count);
	
	goTiles(y-1,x,tiles);
	goTiles(y,x+1,tiles);
	goTiles(y+1,x,tiles);
	goTiles(y,x-1,tiles);
    }
}