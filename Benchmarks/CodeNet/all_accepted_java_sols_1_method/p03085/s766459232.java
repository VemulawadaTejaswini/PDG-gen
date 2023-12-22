import java.util.*;
import java.io.*;

public class Main
{
  	char c;
  
    Main(Scanner in, PrintWriter out)
    {
      c = in.next().charAt(0);
      if (c == 'A') out.print('T');
      if (c == 'T') out.print('A');
      if (c == 'G') out.print('C');
      if (c == 'C') out.print('G');
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}