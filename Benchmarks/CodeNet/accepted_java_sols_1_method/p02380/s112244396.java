import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String[] input = br.readLine().split(" ");
    	double a = Double.parseDouble(input[0]);
    	double b = Double.parseDouble(input[1]);
    	double c = Double.parseDouble(input[2]);
    	DecimalFormat df = new DecimalFormat("0.00000");
    	
    	double s;
    	double l;
    	double h;
    	
    	h = b * Math.sin(c * Math.PI/180);
    	s = a * h / 2;
    	l = Math.sqrt(Math.pow(a - b * Math.cos(c * Math.PI/180), 2) + Math.pow(h, 2)) + a + b;
    	System.out.println(df.format(s) + " " + df.format(l) + " " + df.format(h));
    	
	}
}