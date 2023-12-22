import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	String[] sar = br.readLine().split(" ");
    	String l;
    	int r = Integer.parseInt(sar[0]);
    	int c = Integer.parseInt(sar[1]);
    	int[] csum = new int[c];
    	int asum = 0;
    	for(int i=0; i<r; i++) {
    		l = br.readLine();
    		sar = l.split(" ");
    		int rsum = 0;
    		for (int j=0; j<c; j++) {
    			int v = Integer.parseInt(sar[j]);
    			rsum += v;
    			csum[j] += v;
    		}
    		out.print(l);
    		out.print(" ");
    		out.println(rsum);
    		asum += rsum;
    	}
        for(int i=0; i<c; i++) {
        	if(i > 0){
        		out.print(" ");
        	}
        	out.print(csum[i]);
        }
        out.print(" ");
        out.println(asum);
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}