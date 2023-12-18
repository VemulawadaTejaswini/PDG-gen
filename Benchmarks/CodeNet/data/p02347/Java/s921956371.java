import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PointArray parray = new PointArray(n);
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			int x = Integer.parseInt(tmpArray[0]);
			int y = Integer.parseInt(tmpArray[1]);
			
			parray.addPoint(x, y);
		}
		
		int q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < q; i++){
			String[] tmpArray = br.readLine().split(" ");
			int sx = Integer.parseInt(tmpArray[0]);
			int tx = Integer.parseInt(tmpArray[1]);
			int sy = Integer.parseInt(tmpArray[2]);
			int ty = Integer.parseInt(tmpArray[3]);
			
			parray.printPoint(sx, tx, sy, ty);
		}

	}

}

class PointArray {
	private Point[] array;
	private int currentIndex = 0;
	
	public PointArray(int n){
		array = new Point[n];
	}
	
	public void addPoint(int x, int y){
		array[currentIndex] = new Point(x, y);
		currentIndex++;
	}
	
	public void printPoint(int x1, int x2, int y1, int y2){
		int count = 0;
		
		for(int i = 0; i < array.length ; i++){
			Point p = array[i];
			if(p.x >= x1 && p.x <= x2 && p.y >= y1 && p.y <= y2){
				System.out.println(i);;
			}
		}
		
		if(count == 0){
			System.out.println();
		}
	}
}

class Point {
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}