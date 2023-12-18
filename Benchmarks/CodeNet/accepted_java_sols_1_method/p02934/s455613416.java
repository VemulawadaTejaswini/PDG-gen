import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k;

		int t = Integer.parseInt(br.readLine());    
        StringTokenizer st = new StringTokenizer(br.readLine());
    
      	double sum=0;
		for(i=0;i<t;i++){
          double ar=Double.parseDouble(st.nextToken());
          sum+=1/ar;
          
        }
      	
      	//sum=power(sum,mod-2)%mod;
      out.print(1/sum);
	out.flush();
	out.close();
	
	}
}