import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static final double EPS=1e-10;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String[] array=br.readLine().split(" ");
			double[] x=new double[4];
			double[] y=new double[4];
			for(int j=0; j<4; j++) {
				x[j]=Double.parseDouble(array[j*2]);
				y[j]=Double.parseDouble(array[j*2+1]);
			}
			
			double slope1=(y[1]-y[0])/(x[1]-x[0]);
			double slope2=(y[3]-y[2])/(x[3]-x[2]);
			
			System.out.println((slope1-slope2)<EPS?"YES":"NO");
		}
	}
}