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
      int flag=0;
      for(i=9;i>0;i--)
      {
        flag=0;
        if(n%i==0)
        {
          if(n/i<10 && n/i>0)
            out.print("Yes");
          else
            out.print("No");
          flag=1;
          break;
        }
      }
      if(flag==0)
        out.print("No");
    	out.flush();
    	out.close();
    	}
    }