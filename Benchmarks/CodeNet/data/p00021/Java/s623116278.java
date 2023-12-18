import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			String[] tmpArray = tmp.split(" ");
			
			Point2D.Double[] points = new Point2D.Double[4];
			for(int j = 0; j < points.length ;j++){
				points[j] = new Point2D.Double(Double.parseDouble(tmpArray[j*2]), Double.parseDouble(tmpArray[j*2+1]));
			}
			
			//???????????????????????????????°???????
			if((points[1].y - points[0].y)*(points[3].x - points[2].x) == (points[3].y - points[2].y)*(points[1].x - points[0].x)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}