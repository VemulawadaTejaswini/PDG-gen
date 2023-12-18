import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			Square[] sq = new Square[n];
			sq[0] = new Square(0, 0);
			
			int[] dx = {-1,0,1,0};
			int[] dy = {0,-1,0,1};
			
			for(int i = 1; i < n; i++){
				String[] tmpArray = br.readLine().split(" ");
				int dist = Integer.parseInt(tmpArray[1]);
				int id = Integer.parseInt(tmpArray[0]);

				sq[i] = new Square(sq[id].x + dx[dist], sq[id].y + dy[dist]);
			}
			
			int left = 0;
			int right = 0;
			int top = 0;
			int bottom = 0;
			for(int i = 0; i < n; i++){
				int x = sq[i].x;
				int y = sq[i].y;
				
				left = Math.min(x, left);
				right = Math.max(x, right);
				top = Math.max(y, top);
				bottom = Math.min(y, bottom);
			}
			
			System.out.println((right - left + 1)+" "+(top - bottom + 1));
		}
	}

}

class Square {
	int x;
	int y;
	
	public Square(int x, int y){
		this.x = x;
		this.y = y;
	}
}