import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    
	public static void main(String[] args) throws Exception {

		double d1=0,d2=0,d3=0,d4=0,xy;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine() );

		int[] x = new int[n];
		int[] y = new int[n];

		String[] strX = br.readLine().split(" ", n);
		String[] strY = br.readLine().split(" ", n);
		
		for(int i=0; i<n; i++)
		{
			x[i] = Integer.parseInt(strX[i]);
			y[i] = Integer.parseInt(strY[i]);
		}
		
		for(int i=0; i<n; i++)
		{
			xy = Math.abs(x[i] - y[i]);
			
			d1 = d1 + Math.pow(xy, 1);
			d2 = d2 + Math.pow(xy, 2);
			d3 = d3 + Math.pow(xy, 3);
			d4 = Math.max(xy, d4);
			
		}
		
		System.out.printf("%.5f\n",d1);
		System.out.printf("%.5f\n",Math.sqrt(d2) );
		System.out.printf("%.5f\n",Math.cbrt(d3) );
		System.out.printf("%.5f\n",d4);

	}
}