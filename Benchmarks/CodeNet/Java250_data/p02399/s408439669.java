import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x, y, d , r;
        double f;
        try{
        	String[] list = br.readLine().split(" ");
        	x = Integer.parseInt(list[0]);
        	y = Integer.parseInt(list[1]);
        	
        	d = x / y;
        	r = x % y;
        	f = (double)x / (double)y;
        	DecimalFormat df = new DecimalFormat("0.00000");
            System.out.println(d + " " + r + " " + df.format(f));
        }
        catch(IOException e){
        	e.printStackTrace();
        }
	}

}