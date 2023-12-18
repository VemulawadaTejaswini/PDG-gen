import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void exec() throws IOException {
    	try(
    			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    			PrintWriter out = new PrintWriter(System.out);
    			){
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            String[] s2 = new String[n];
            for(int i=0; i<n; i++) {
            	s2[i] = s[n-i-1];
            }
            out.println(String.join(" ",s2));
            out.flush();
    	}
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}
 