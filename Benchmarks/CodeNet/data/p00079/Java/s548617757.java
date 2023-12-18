import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		double[] x = new double[20];
		double[] y = new double[20];
		int i = 0;
		String string;
		
		while((string = reader.readLine()) != null){
			x[i] = Double.valueOf(string.split(",")[0]);
			y[i] = Double.valueOf(string.split(",")[1]);
			i++;
		}
		
		double a = Math.hypot(x[1] - x[0], y[1] - y[0]);
		double b = Math.hypot(x[2] - x[0], y[2] - y[0]);
		double c = Math.hypot(x[2] - x[1], y[2] - y[1]);
		double z = (a + b + c) / 2;
		double S = Math.sqrt(z * (z - a) * (z - b) * (z - c));
		for(int j = 2; j < i - 1; j++){
			a = Math.hypot(x[j] - x[0], y[j] - y[0]);
			b = Math.hypot(x[j + 1] - x[0], y[j + 1] - y[0]);
			c = Math.hypot(x[j + 1] - x[j], y[j + 1] - y[j]);
			z = (a + b + c) / 2;
			S += Math.sqrt(z * (z - a) * (z - b) * (z - c));
		}
		System.out.println(S);
	}
}