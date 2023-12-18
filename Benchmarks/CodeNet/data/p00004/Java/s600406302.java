import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) {
    	
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	String buf;
    	int a,b,c,d,e,f;
    	double x,y;
    	
    	try{
    		while((buf = br.readLine())!=null)
    		{
    			StringTokenizer st = new StringTokenizer(buf);
    			a = Integer.parseInt(st.nextToken());
    			b = Integer.parseInt(st.nextToken());
    			c = Integer.parseInt(st.nextToken());
    			d = Integer.parseInt(st.nextToken());
    			e = Integer.parseInt(st.nextToken());
    			f = Integer.parseInt(st.nextToken());
    			x = (e*c-b*f)/(a*e-b*d);
    			y = (-d*c+f*a)/(a*e-b*d);
    			
    			if(x == -0.0)
                    x = 0.0;
                if(y == -0.0)
                    y = 0.0;
                System.out.printf("%4.3f %4.3f\n", x, y);
    		}
    	} catch (Exception err){
    		System.out.println("Exception");
    	}
    }
}