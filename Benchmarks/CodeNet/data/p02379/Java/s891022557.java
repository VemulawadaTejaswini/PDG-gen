import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String[] input = br.readLine().split(" ");
    	double x1 = Integer.parseInt(input[0]);
    	double y1 = Integer.parseInt(input[1]);
    	double x2 = Integer.parseInt(input[2]);
    	double y2 = Integer.parseInt(input[3]);
    	DecimalFormat df = new DecimalFormat("0.00000");
    	
    	double ans = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    	System.out.println(df.format(ans));
    	
	}
}