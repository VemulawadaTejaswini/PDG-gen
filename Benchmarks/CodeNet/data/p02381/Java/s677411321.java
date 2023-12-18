import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n;
			if((n = Integer.parseInt(br.readLine())) == 0)
				break;

			String[] pointsStr = br.readLine().split(" ");
			int[] points = new int[n];
			for(int i = 0;i < n;i++){
				points[i] = Integer.parseInt(pointsStr[i]);
			}

			int sum = 0;
			for(int point : points){
				sum += point;
			}
			double mean = (new Double(sum)) / n;
			double disp = 0;
			for(int point : points){
				disp += (point - mean) * (point - mean);
			}
			disp /= n;
			System.out.printf("%.8f%n", Math.sqrt(disp));
		}
	}

}