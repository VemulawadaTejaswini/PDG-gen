import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	//try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k;

		int t = Integer.parseInt(br.readLine());    
        out.print(t*t*t);
	
	out.flush();
	out.close();
	//}catch(Exception e){}
	}
}