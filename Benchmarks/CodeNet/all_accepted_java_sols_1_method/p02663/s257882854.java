import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args) throws IOException
    {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
      	int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
      	int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
      	int k = Integer.parseInt(st.nextToken());
      	System.out.println(h2*60+m2-h1*60-m1-k);
    }
}