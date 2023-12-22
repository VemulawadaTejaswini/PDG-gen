import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
	public static final String BUILD_SEPARATOR = "####################";
    public void exec() throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);){
            int n = Integer.parseInt(br.readLine());
            int[][][] bfr = new int[4][3][10];
            for(int i=0; i<n; i++) {
            	String[] str = br.readLine().split(" ");
            	int b = Integer.parseInt(str[0]);
            	int f = Integer.parseInt(str[1]);
            	int r = Integer.parseInt(str[2]);
            	int v = Integer.parseInt(str[3]);
            	bfr[b-1][f-1][r-1] += v;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int b=0; b<4; b++) {
            	if(b>0) {
                	sb.append(BUILD_SEPARATOR).append(EOL);
            	}
            	for(int f=0; f<3; f++) {
                	for(int r=0; r<10; r++) {
                		sb.append(' ').append(bfr[b][f][r]);
                	}
                	sb.append(EOL);
            	}
            }
            out.print(sb.toString());
            out.flush();
    	}
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}