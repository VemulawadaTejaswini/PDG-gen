import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size];
    int j=0;
    StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
    while(tokenizer1.hasMoreTokens())
    {
      arr[j] = Integer.parseInt(tokenizer1.nextToken());
      j++;
    }
    
    Arrays.sort(arr);
    
    double ans = 0.0;
    ans = arr[0] + arr[1];
    int k = 1;
    for(int i=2;i<size;i++)
    {
      ans += arr[i] * Math.pow(2,k);
      k++;
    }
    double ans2 = ans/Math.pow(2,size-1);
    int ans3 = (int)ans2;
    System.out.println(ans2);
  }
}