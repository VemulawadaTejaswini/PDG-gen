import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			String[] tmpArray = tmp.split(",");
			Point[] points = new Point[4];
			
			for(int i = 0; i < 4; i++){
				points[i] = new Point((int)(Double.parseDouble(tmpArray[i*2])*10000), (int)(Double.parseDouble(tmpArray[i*2+1])*10000));
			}
			
			Polygon triangle = new Polygon();
			triangle.addPoint(points[0].x, points[0].y);
			triangle.addPoint(points[1].x, points[1].y);
			triangle.addPoint(points[3].x, points[3].y);
			
			if(triangle.contains(points[2])){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
	}

}