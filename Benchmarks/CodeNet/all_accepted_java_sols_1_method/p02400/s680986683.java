import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
    public static void main(String[] args){
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		String buf = br.readLine();
    		double r = Double.parseDouble(buf);
        
    		double pi = Math.PI;
        	double S = r * r * pi;
        	double R = 2 * r * pi;
        
        	System.out.printf("%f %f", S, R);
    	}catch (IOException e){
    		System.err.println(e);
        }
    }
}