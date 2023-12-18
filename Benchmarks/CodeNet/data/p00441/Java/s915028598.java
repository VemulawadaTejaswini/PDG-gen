import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;


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
			
			//System.out.println("n = "+n);
			
			boolean[][] post = new boolean[5001][5001];
			ArrayList<Point> plist = new ArrayList<Point>();
			
			for(int i = 0; i < n; i++){
				String[] tmpArray = br.readLine().split(" ");
				int x = Integer.parseInt(tmpArray[0]);
				int y = Integer.parseInt(tmpArray[1]);
				post[y][x] = true;
				plist.add(new Point(x, y));
			}
			
			//Iterator<Point> it = plist.iterator();
			Point[] parray = plist.toArray(new Point[plist.size()]);
			
			int maxArea = 0;
			
			for(int i = 0; i < n - 1; i++){
				int x1 = parray[i].x;
				int y1 = parray[i].y;
				for(int j = i + 1; j < n; j++){
					int v1x = parray[j].x - x1;
					int v1y = parray[j].y - y1;
					
					int v2x = v1y*(-1);
					int v2y = v1x;
					
					int v3x = v1y;
					int v3y = v1x*(-1);
					
					//if((v1x + v2x)*(v1x + v2x) >= 15000000) System.out.println((v1x + v2x)*(v1x + v2x));
					
					if(inRange(x1 + v2x, y1 + v2y) && post[y1 + v2y][x1 + v2x]
							&& inRange(x1+v1x+v2x, y1 + v1y + v2y) && post[y1+v1y+v2y][x1+v1x+v2x]){
						//long tmpArea = (v1x + v2x)*(v1x + v2x) - Math.abs(2*v1x*v1y);
						int tmpArea = (int)Math.pow(Math.abs(v1x) + Math.abs(v2x), 2)- Math.abs(2*v1x*v1y);
						
						
						
						if(tmpArea > maxArea){
							maxArea = tmpArea;
							//System.out.println("Type 1 i = "+i+" j = "+j +" area = "+maxArea);
						}
					}
					
//					else if(inRange(x1 + v3x, y1 + v3y) && post[y1 + v3y][x1 + v3x]
//							&& inRange(x1+v1x+v3x, y1 + v1y + v3y) && post[y1+v1y+v3y][x1+v1x+v3x]){
//						//int tmpArea = (v1x + v3x)*(v1x + v3x) - Math.abs(2*v1x*v1y);
//						int tmpArea = (v1x + v3x)*(v1x + v3x) ;
//								
//						if(tmpArea > maxArea){
//							maxArea = tmpArea;
//							System.out.println("Type 2 i = "+i+" j = "+j +" area = "+maxArea);
//						}
//					}
				}
			}
			
			System.out.println(maxArea);
		}
	}
	
	static boolean inRange(int x, int y){
		if(x >= 0 && x <= 5000 && y >= 0 && y <= 5000){
			return true;
		}
		else {
			return false;
		}
	}

}

class Point{
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}