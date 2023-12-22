import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st = new StringTokenizer(br.readLine());
   int h1 = Integer.parseInt(st.nextToken());
   int s1 = Integer.parseInt(st.nextToken());
   int h2 = Integer.parseInt(st.nextToken());
   int s2 = Integer.parseInt(st.nextToken());
   int t1 = (h2%s1==0?h2/s1:h2/s1+1);
   int t2 = (h1%s2==0?h1/s2:h1/s2+1);
   if(t1<=t2)
   	System.out.println("Yes");
   else
   		System.out.println("No");
   }
}
