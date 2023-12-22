import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;
		
      StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
      	m = Integer.parseInt(st.nextToken());
      	
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
      for(int j=1;j<=n;j++)
      {
        int tmp=Integer.parseInt(st.nextToken());
        q.offer(tmp);
      }
      for(i=1;i<=m;i++)
      {
        int tm=q.poll();
        q.offer(tm/2);
      }
      long sum=0;
      while(!q.isEmpty())
      {
        sum+=q.poll();
      }
      out.print(sum);
	out.flush();
	out.close();
	}
}