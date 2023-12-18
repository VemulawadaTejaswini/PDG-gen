import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int w = Integer.parseInt(tmpArray[0]);
			int h = Integer.parseInt(tmpArray[1]);
			
			if(w == 0 && h == 0){
				break;
			}
			
			int matrix[][] = new int[h][w];
			
			for(int i = 0; i < h; i++){
				tmpArray = br.readLine().split(" ");
				for(int j = 0; j < w; j++){
					matrix[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}
			
			visited = new boolean[h][w];
			
			int island = 0;
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(matrix[i][j] == 1 && !visited[i][j]){
						dfsWithStack(matrix, j, i, 1);
						island++;
					}
				}
			}
			
			System.out.println(island);
		}
	}
	
	static boolean[][] visited;
	static int[] dx = {0,1,1,1,0,-1,-1,-1};
	static int[] dy = {1,1,0,-1,-1,-1,0,1};
	
	static void dfsWithStack(int[][] matrix, int x, int y, int type){
        int h = matrix.length;
        int w = matrix[0].length;
 
        Stack<Point> stack = new Stack<Point>();
 
        visited[y][x] = true;
//    	System.out.println("start x "+x+ " y "+ y);
        
    	stack.add(new Point(x, y));
 
        while(!stack.isEmpty()){
            Point p = stack.pop();
 
//          visited[p.y][p.x] = true;
            //???
            for(int i = 0; i < 8; i++){
            	int x2 = p.x + dx[i];
            	int y2 = p.y + dy[i];
            	
            	
            	if(x2 >= 0 && x2 < w && y2 >= 0 && y2 < h && matrix[y2][x2] == type && !visited[y2][x2]){
//            		System.out.println("push x2 "+x2+ " y2 "+ y2);
                	
            		stack.push(new Point(x2, y2));
            		visited[y2][x2] = true;
            	}
            }
//            
//            if(p.x > 0 && matrix[p.y][p.x - 1] == type && !visited[p.y][p.x - 1]){
//                stack.push(new Point(p.x-1, p.y));
//                visited[p.y][p.x-1] = true;
//            }
// 
//            //???
//            if(p.y < h - 1 && matrix[p.y+1][p.x] == type && !visited[p.y+1][p.x]){
//                stack.push(new Point(p.x, p.y+1));
//                visited[p.y+1][p.x] = true;
//            }
// 
//            //???
//            if(p.x < w - 1 && matrix[p.y][p.x + 1] == type && !visited[p.y][p.x + 1]){
//                stack.push(new Point(p.x+1, p.y));
//                visited[p.y][p.x+1] = true;
//            }
// 
//            //???
//            if(p.y > 0 && matrix[p.y-1][p.x] == type && !visited[p.y-1][p.x]){
//                stack.push(new Point(p.x, p.y-1));
//                visited[p.y-1][p.x] = true;
//            }
// 
        }
    }
}
 
class Point{
    int x; int y;
 
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}