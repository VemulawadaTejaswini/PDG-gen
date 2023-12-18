import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String source[];
		while((source = reader.readLine().split(" ")) != null){
			double array[] = new double[6];
			for(int i = 0; i < 6; i++){
				array[i] = Double.valueOf(source[i]);
			}
			double mat = array[0] * array[4] - array[1] * array[3];
			double x = (array[2] * array[4] - array[5] * array[1]) / mat;
			double y = (array[0] * array[5] - array[2] * array[3]) / mat;
			System.out.printf("%.3f %.3f", x, y);
		}
	}
}