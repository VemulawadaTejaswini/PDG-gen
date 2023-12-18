import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        
        DecimalFormat df = new DecimalFormat("0.00000");
        while (true)
        {
        	int n = Integer.parseInt(br.readLine());
        	if (n == 0)
        		break;
        	String[] tensu = br.readLine().split(" ");
        	
        	double sum = 0;
        	double asum = 0;
        	double average = 0;
        	double hensa = 0;
        	for (int i = 0; i < n; i++)
        	{
        		sum += Double.parseDouble(tensu[i]);
        	}
        	average = sum / n;
        	for (int i = 0; i < n; i++)
        	{
        		asum += Math.pow(Double.parseDouble(tensu[i]) - average, 2);
        	}
        	
        	hensa = Math.sqrt(asum / n);
        	System.out.println(df.format(hensa));
        }
    	
	}
}