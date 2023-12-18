import java.util.Scanner;

public class Main {
	public static boolean visited[][];
	public static String[][] map;
	static int numberOfBlack;
	
	public static void CheckBlackTiles(int a, int b,int w,int h) {
		numberOfBlack++;
		visited[a][b] = true;
		if(a+1<h && map[a+1][b].equals(".")&& visited[a+1][b]==false) {
			CheckBlackTiles(a+1,b,w,h);
		}
		if(a-1>=0 && map[a-1][b].equals(".")&& visited[a-1][b]==false) {
			CheckBlackTiles(a-1,b,w,h);
		}
		if(b+1<w && map[a][b+1].equals(".") && visited[a][b+1]==false) {
			CheckBlackTiles(a,b+1,w,h);
		}
		if(b-1>=0 && map[a][b-1].equals(".") && visited[a][b-1]==false) {
			CheckBlackTiles(a,b-1,w,h);
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int w;
		int h;
		
		while(true) {
			w = in.nextInt();
			h = in.nextInt();
			if(w==0||h==0) {
				break;
			}
			
			numberOfBlack=0;
			map = new String[h][w];
			visited = new boolean[h][w];

			
			for(int i=0; i<h;i++){    
                String buffer=in.next();
                //文字列格納後に1文字ずつ分離
                for(int l=0; l<buffer.length();l++) {
                	map[i][l]= String.valueOf(buffer.charAt(l));
                	visited[i][l]= false;
                }
			}

			for(int i=0; i<h;i++){
                for(int k=0; k<w;k++){
                	if(map [i][k].equals("@")&&visited[i][k]==false){
                		CheckBlackTiles(i,k,w,h);
                    }
                }      
			}
			System.out.println(numberOfBlack);
		}
		in.close();
	}
}