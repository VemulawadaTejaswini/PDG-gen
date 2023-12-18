import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(input.readLine());
		String xline = input.readLine();
		String yline = input.readLine();
		String[] xstr = xline.split(" ");
		String[] ystr = yline.split(" ");
		double[] x = new double[n];
		double[] y = new double[n];
		double p1 = 0 , p2 = 0 , p3 = 0 , p = 0;
			for(int i = 0 ; i < n ; i++){
				x[i] = Double.parseDouble(xstr[i]);
				y[i] = Double.parseDouble(ystr[i]);
				p1 += Math.abs(x[i] - y[i]);
				p2 += Math.pow(x[i] - y[i] , 2);
				p3 += Math.pow(Math.abs(x[i] - y[i]) , 3);
				if( p < Math.abs(x[i] - y[i])) p = Math.abs(x[i] - y[i]);
			}
			p2 = Math.sqrt(p2);
			p3 = Math.cbrt(p3);
			
			
		System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p);
	}

}