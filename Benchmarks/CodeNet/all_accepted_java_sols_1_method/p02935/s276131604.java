import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k, j;

		int t = Integer.parseInt(br.readLine());    
        StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] ar = new int[t];
     
		for(i=0;i<t;i++)
          ar[i]=Integer.parseInt(st.nextToken());
      
      Arrays.sort(ar);
         double sum=ar[0],max=0;
        for(i=1;i<t;i++)
        {
          sum=(sum+ar[i])/2;
        }
	out.print(sum);
	out.flush();
	out.close();
	
	}
}