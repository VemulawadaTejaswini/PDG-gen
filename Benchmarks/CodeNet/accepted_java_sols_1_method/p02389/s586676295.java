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
    		System.out.println( a*b + " " +(a+b)*2);

    	} catch(IOException e) {
		    System.err.println(e);
		}
    }
}