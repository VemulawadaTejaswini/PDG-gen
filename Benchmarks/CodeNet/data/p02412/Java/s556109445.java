import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	String[] s;
    	int n,x;
    	while(true) {
    		s = br.readLine().split(" ");
    		n = Integer.parseInt(s[0]);
            x = Integer.parseInt(s[1]);
            if(n == 0 && x == 0) 
            	break;
            int count = 0;
            for(int i=Math.max(x-n-(n-1),1); i<=Math.min(n-2,x/3-1); i++)
            	for (int j=Math.max(x-i-n,i+1); j<=Math.min(n-1,(x-i)/2); j++) {
            		int k = x - i - j;
            		if (j<k && k<=n) count++;
        		}
            out.println(count);
    	}
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}