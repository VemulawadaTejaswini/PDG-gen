
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {
        
        int a,b,x,y;
        int c = 1;
        String term[] = new String[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(st, " ");
	while(tokenizer.hasMoreTokens()) {
	    term[c] = tokenizer.nextToken();
	    c++;
	}

        a = Integer.parseInt(term[1]);
        b = Integer.parseInt(term[2]);
        x = a*b;
        y = 2*a + 2*b;
        System.out.println(x+" "+y);        
    
    }
    
}