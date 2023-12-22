import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		
		
		out.println((int)Math.ceil((1.0*(b-1))/(a-1)));
		
		
		out.flush();
		out.close();
	}
	
	
	


}
