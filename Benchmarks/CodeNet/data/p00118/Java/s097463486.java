
import java.util.*;

public class Main {

	private static int H, W;   //W?列，H?行
	private static char[][] data;
	
	public static void main(String[] args) {
		
		Scanner fin = new Scanner(System.in);
		
		ArrayList result = new ArrayList();  //存放?果
		data = new char[100][100];
		int x = 0,y = 0;
		H = fin.nextInt(); 
		W = fin.nextInt();			
		int count = 0;
		while(W != 0 && H != 0){			
			fin.nextLine();
			for(int i=0; i<H; i++ ){
				String line = fin.nextLine().toString().replace(" ", "");  //?取一行数据，并去掉空格				
				for(int j=0; j<W; j++){
					data[i][j] = line.charAt(j);								
				}
			}
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					if(data[i][j] == '@'||data[i][j] == '*'||data[i][j] == '#'){
						x = i ;
						y = j ;
						DFS(x,y);
						count++;
					}
				}
			}
			result.add(count);
			count = 0;
			W = fin.nextInt(); 
			H = fin.nextInt();
	    }
		
		for(int i=0; i < result.size(); i++){
			System.out.printf("%d\n",result.get(i));
		}
	}
	
	private static int DFS(int x, int y){
		char c = data[x][y];
		data[x][y] = ' ';
		if(x >= 0 && x < H && y > 0 && y < W && data[x][y-1] == c){
			DFS(x, y-1);
		}
		if(x >= 0 && x < H && y >= 0 && y < W-1 && data[x][y+1] == c){
			DFS(x, y+1);
		}
		if(x > 0 && x < H && y >= 0 && y < W && data[x-1][y] == c){
			DFS(x-1, y);
		}
		if(x >= 0 && x < H-1 && y >= 0 && y < W && data[x+1][y] == c){
			DFS(x+1, y);
		}
		
		return 1;		
	}
}