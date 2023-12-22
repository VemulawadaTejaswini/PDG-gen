import java.util.*;
import java.io.*;

public class Main
{
  	int n, max = -1000000;
 	int[] v, c;
  
    Main(Scanner in, PrintWriter out)
    {
    	n = in.nextInt();
      	v = new int[n];
      	c = new int[n];
      	for (int i = 0; i < n; i++)
        	v[i] = in.nextInt();
      	for (int i = 0; i < n; i++)
          	c[i] = in.nextInt();
      	for (int i = 0; i < (1 << n); i++)
        {
          	int V = 0, C = 0;
          	for (int j = 0; j < n; j++)
              	if ((i & (1 << j)) > 0)
                {
                  	V += v[j];
                  	C += c[j];
                }
          	max = Math.max(max, V-C);
        }
      	
      	out.println(max);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}