import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		double x1, y1, x2, y2, xq, yq, m, n, in1, in2, v1, v2, x, y;
		
		while((string = reader.readLine()) != null){
			x1 = Double.parseDouble(string.split(",")[0]);
			y1 = Double.parseDouble(string.split(",")[1]);
			x2 = Double.parseDouble(string.split(",")[2]);
			y2 = Double.parseDouble(string.split(",")[3]);
			xq = Double.parseDouble(string.split(",")[4]);
			yq = Double.parseDouble(string.split(",")[5]);
			
			if(x2 - x1 == 0){
				System.out.printf("%.6f %.6f\n", 2 * x1 - xq, yq);
			}else if(y2 - y1 == 0){
				System.out.printf("%.6f %.6f\n", xq, (2 * y1 - yq));
			}else{
				m = (y2 - y1) / (x2 - x1);
				n = -1 / m;
				in1 = y1 - m * x1;
				in2 = yq - n * xq;
				v1 = (in1 - in2) / (n - m);
				v2 = (n * in1 - m * in2) / (n - m);
				x = 2 * v1 - xq;
				y = 2 * v2 - yq;
				System.out.printf("%.6f %.6f\n", x, y);
			}
		}
	}
}