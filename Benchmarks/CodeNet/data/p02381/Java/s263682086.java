import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			if (Integer.parseInt(br.readLine()) == 0) {
				break;
			} else {
				String[] pointsStr = br.readLine().split(" ");
				int[] points = new int[pointsStr.length];
				for(int i = 0;i < points.length;i++){
					points[i] = Integer.parseInt(pointsStr[i]);
				}
				
				long sum = 0;
				double mean;
				double variance = 0;
				
				for(int a : points){
					sum += a;
				}
				
				mean = sum / points.length;
				
				for(int a : points){
					variance += (a - mean) * (a - mean);
				}
				
				variance /= points.length;
				
				double sd = Math.sqrt(variance);
				
				System.out.println(sd);
			}
		}
	}

}