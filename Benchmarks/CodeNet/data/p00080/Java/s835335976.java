import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		double x, q;
		
		while(!(string = reader.readLine()).equals("-1")){
			q = Double.valueOf(string);
			x = q / 2.0;
			while(true){
				x -= (x * x * x - q) / (3 * x * x);
				if(Math.abs(x * x * x - q) < .00001 * q) break;
			}
			System.out.printf("%.6f\n", x);
		}	
		reader.close();
	}
}