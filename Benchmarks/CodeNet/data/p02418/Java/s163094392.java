import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	String s = br.readLine();
    	String p = br.readLine();
    	out.println((s+s).contains(p)?"Yes":"No");
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}