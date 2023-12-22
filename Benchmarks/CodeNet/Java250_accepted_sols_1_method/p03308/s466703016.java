import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
      	st = new StringTokenizer(br.readLine());
      	int y[]=new int[t];
      	int p=0;
      	while(st.hasMoreTokens())
        {
          y[p]=Integer.parseInt(st.nextToken());
          p++;
        }
      	Arrays.sort(y);
      	System.out.println(y[t-1]-y[0]);
    }
}