import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			StringTokenizer st=new StringTokenizer(buf," ");
	    	int a = Integer.parseInt(st.nextToken());
	    	int b = Integer.parseInt(st.nextToken());
	    	int c = Integer.parseInt(st.nextToken());
			int cnt=0;
	    	if(a <= b && 1<=a && 1<= b && 1<=c && a<=10000 && b<=10000 && c<=10000){

	    		for(int i=a; i <= b;i++){
	    			if( (c/i) >=1 && (c%i)==0)	cnt++;
	    		}
	    		System.out.println(cnt);
	    	}

    	} catch(IOException e) {
    		System.err.println(e);
		}
    }
}