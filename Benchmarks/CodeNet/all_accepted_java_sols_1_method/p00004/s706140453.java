import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) {
    	
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	String buf;
    	int a,b,c,d,e,f;
    	double x,y,div;
    	
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
    			div= (double)(a*e-b*d);
    			x = (double)(e*c-b*f);
    			y = (double)(-d*c+f*a);
    			
    			BigDecimal xVal = new BigDecimal(x/div);
    			BigDecimal yVal = new BigDecimal(y/div);
    			
    			xVal = xVal.setScale(3, BigDecimal.ROUND_HALF_UP);
    			yVal = yVal.setScale(3, BigDecimal.ROUND_HALF_UP);
    			
                System.out.println(xVal+" "+yVal);
    			
    		}
    	} catch (Exception err){
    		System.out.println("Exception");
    	}
    }
}