import java.util.*;
import java.io.*;

public class Main
{	
  	int a, b;
  
    Main(Scanner in, PrintWriter out)
    {
      a = in.nextInt()-1;
      b = in.nextInt()-1;
      out.print(a*b);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}