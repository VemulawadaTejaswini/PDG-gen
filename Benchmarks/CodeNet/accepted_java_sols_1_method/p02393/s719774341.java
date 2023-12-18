import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
    	
    	try {
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		String buf = br.readLine();
    		StringTokenizer st=new StringTokenizer(buf," ");
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());
    		int x;
    		if(a > b){
    			x=b;
    			b=a;
    			a=x;
    		}
    		if(b > c){
    			x=c;
    			c=b;
    			b=x;
    		}
    		if(a > b){
    			x=b;
    			b=a;
    			a=x;
    		}
    		System.out.println(a+" "+b+" "+c);
    	} catch(IOException e) {
		    System.err.println(e);
		}
    }
}