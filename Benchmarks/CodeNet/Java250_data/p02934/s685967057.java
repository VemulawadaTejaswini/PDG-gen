import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int size = Integer.parseInt(br.readLine());
      int[] arr = new int[size];
      double sum=0.0;
      StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
      int j=0;
      while(tokenizer1.hasMoreTokens())
      {
        arr[j] = Integer.parseInt(tokenizer1.nextToken());
        j++;
      }
      double num = 0.0;
      for(int i=0;i<size;i++)
      {
        num = (double)arr[i];
        sum += (1.0/num);
      }
      double ans = 1/sum;
      System.out.println(ans);
    }
}
