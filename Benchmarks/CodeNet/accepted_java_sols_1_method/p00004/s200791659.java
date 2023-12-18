import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
   	    try{
   	    	String buf;
          while((buf = br.readLine()) != null){
        	double a,b,c,d,e,f;
            String[] co = buf.split("\\s");
            a = Double.parseDouble(co[0]);
            b = Double.parseDouble(co[1]);
            c = -1*Double.parseDouble(co[2]);
            d = Double.parseDouble(co[3]);
            e = Double.parseDouble(co[4]);
            f = -1*Double.parseDouble(co[5]);
            double x = -((c*(a*e-b*d)-b*(a*f-d*c))/(a*(a*e-b*d)));
            double y = -(a*f-c*d)/(a*e-b*d);
            if(x == -0.0) x = 0.0;
            if(y == -0.0) y = 0.0;
            String strx = String.format("%4.3f",x);
            String stry = String.format("%4.3f",y);
            //System.out.printf(strx+" "+stry);
            System.out.printf("%4.3f %4.3f\n", x, y);
   	      }
   	    }catch(Exception e){
   	    	
   	    }
	}
}