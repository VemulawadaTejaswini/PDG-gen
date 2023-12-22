import java.io.*;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] numbers = line.split(" ");
			double[] coef = new double[6];
			
			for(int i = 0; i < 6; i++){
				coef[i] = Double.parseDouble(numbers[i]);
			}
			
			double x = (coef[2]*coef[4]-coef[1]*coef[5])/(coef[0]*coef[4]-coef[1]*coef[3]);
			double y = (coef[0]*coef[5]-coef[2]*coef[3])/(coef[0]*coef[4]-coef[1]*coef[3]);
			
			if(x == 0.0){
				x = Math.abs(x); 
			}
			
			if(y == 0.0){
				y = Math.abs(y); 
			}
			
            System.out.printf("%.3f %.3f\n", x, y);
        }
	}
}