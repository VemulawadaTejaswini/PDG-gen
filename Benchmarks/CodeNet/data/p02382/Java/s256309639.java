import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        
        DecimalFormat df = new DecimalFormat("0.00000");
        int n = Integer.parseInt(br.readLine());
    	String[] xninput = br.readLine().split(" ");
    	String[] yninput = br.readLine().split(" ");
    	
    	double dxy = 0d;
		double[] ab = new double[n];
		for (int j = 0; j < n; j++)
		{
			double xn = Double.parseDouble(xninput[j]);
			double yn = Double.parseDouble(yninput[j]);
			ab[j] = Math.abs(xn - yn);
		}
		
    	for (int i = 1; i <= 3; i++)
    	{
    		double po = 0d;
    		for (int j = 0; j < n; j++)
    		{
    			po += Math.pow(ab[j], i);
    		}
    		double ruijou =  1 / (double)i;
    		dxy = Math.pow(po, ruijou);
    		System.out.println(df.format(dxy));
    	}
    	
    	dxy = 0d;
    	for (double value: ab)
    	{
    		dxy = Math.max(dxy, value);
    	}
    	System.out.println(df.format(dxy));
	}
}