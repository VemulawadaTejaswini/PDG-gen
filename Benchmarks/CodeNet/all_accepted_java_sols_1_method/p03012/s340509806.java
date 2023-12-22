import java.util.*;
import java.io.*;

public class Main
{
  	int n, sum = 0;
  	int[] w;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.nextInt();
      w = new int[n];
      for (int i = 0; i < n; i++)
        sum += (w[i] = in.nextInt());
      int min = 1+sum;
      for (int i = 1; i < n; i++)
      {
        int s1 = 0;
        for (int j = 0; j < i; j++)
          s1 += w[j];
        min = Math.min(min, Math.abs((sum-s1)-s1));
      }
      out.println(min);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
