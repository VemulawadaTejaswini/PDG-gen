import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main {
	//static int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
	public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      OutputStream outputStream = System.out;
      PrintWriter out = new PrintWriter(outputStream);

      int i, j, u=0, v=0;
      StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      if(n>9 || n<1 || m>9 || m<1)
        out.print("-1");
      else
        out.print(n*m);
    	out.flush();
    	out.close();
    	}
    }