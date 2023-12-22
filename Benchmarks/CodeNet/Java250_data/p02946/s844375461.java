import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(tokenizer1.nextToken());
    int x = Integer.parseInt(tokenizer1.nextToken());
    
    printPossibleBlack(k,x);
  }
  
  public static void printPossibleBlack(int k, int x)
  {
    int size = 2*Math.abs(k-1) + 1;
    if(size == 0)
    {
      System.out.print(x);
      return;
    }
    int[] arr = new int[size];
    
    int i = x - (k - 1);
    int j = x + (k - 1);
    int k1 = 0;
    
    while(i<=j)
    {
      arr[k1] = i;
      k1++;
      i++;
    }
    
    for(int l=0;l<size;l++)
    {
      System.out.print(arr[l]+" ");
    }
    
  }
}
