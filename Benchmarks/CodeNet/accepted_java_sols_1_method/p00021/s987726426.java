import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

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
			
			BigDecimal[][] points = new BigDecimal[4][2];
			float [][] fpoints = new float[4][2];
			for(int j = 0; j < points.length ;j++){
				points[j][0] = new BigDecimal(tmpArray[j*2]);
				points[j][1] = new BigDecimal(tmpArray[j*1]);
				fpoints[j][0] = Float.parseFloat(tmpArray[j*2]);
				fpoints[j][1] = Float.parseFloat(tmpArray[j*2+1]);
			}
			
			
			//System.out.println("AB:"+points[1][1].subtract(points[0][1]).divide(points[1][0].subtract(points[0][0]), MathContext.DECIMAL64).doubleValue());
			//System.out.println("AB:"+((fpoints[1][1]-fpoints[0][1])/(fpoints[1][0]-fpoints[0][0])));
			/*
			//????????????????????§????????§??????????????£??????NO
			if((points[0][0] == points[1][0] ) || points[2].equals(points[3]))){
				System.out.println("NO");
			}
			
			else*/ 
			if((fpoints[1][0]==(fpoints[0][0])) || (fpoints[3][0]==( fpoints[2][0])) ){
				if((fpoints[1][0]==(fpoints[0][0])) && (fpoints[3][0]==( fpoints[2][0])) ){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			/*
			else if(line1.ptLineDist(points[2]) == line1.ptLineDist(points[3])){
				System.out.println("YES");
			}*/
			/*
			float ab = (fpoints[1][1]-fpoints[0][1])/(fpoints[1][0]-fpoints[0][0]);
			float cd = (fpoints[3][1]-fpoints[2][1])/(fpoints[3][0]-fpoints[2][0]);
			*/
			else if((fpoints[1][1]-fpoints[0][1])/(fpoints[1][0]-fpoints[0][0])
					== (fpoints[3][1]-fpoints[2][1])/(fpoints[3][0]-fpoints[2][0])){
				System.out.println("YES");
			}
			/*
			
			//???????????????????????????????°???????
			else if((points[1][1] - points[0][1])*(points[3][0] - points[2][0]) == (points[3][1] - points[2][1])*(points[1][0] - points[0][0])){
				System.out.println("YES");
			}
			*/
			else{
				System.out.println("NO");
			}
		}
	}

}