import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] arg) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double x=0, y=0, deg=0;
	while(true)
	{
    	    String s = br.readLine();
	    double steps = Double.parseDouble(s.split(",")[0]);
	    double turn  = Double.parseDouble(s.split(",")[1]);
	    if(steps==0 && turn==0)
		break;
	    else {
 	        x += steps*Math.sin(Math.toRadians(deg));
	        y += steps*Math.cos(Math.toRadians(deg));
	        deg += turn;
	    }
	}
	System.out.println((int)x);
	System.out.println((int)y);	
    }
}