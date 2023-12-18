import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; i++){
			String[] strArray = br.readLine().split(" ");
			Point2D.Double o1 = new Point2D.Double(Double.parseDouble(strArray[0]), Double.parseDouble(strArray[1]));
			double r1 = Double.parseDouble(strArray[2]);
			Point2D.Double o2 = new Point2D.Double(Double.parseDouble(strArray[3]), Double.parseDouble(strArray[4]));
			double r2 = Double.parseDouble(strArray[5]);
			
			double dist = o1.distance(o2);
			int result;
			if(dist > r1+r2){
				result = 0;
			}
			else if (r1 >= r2 && r1 >= dist+r2) {
				result = 2;
			}
			else if (r1 < r2 && r2 >= dist+r1){
				result = -2;
			}
			else {
				result = 1;
			}
			System.out.println(result);
		}
	}

}