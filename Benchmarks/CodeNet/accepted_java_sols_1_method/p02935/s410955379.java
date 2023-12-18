import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		
		Double[] arr = new Double[n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ;i++)
			arr[i] = Double.parseDouble(st1.nextToken());
		
		Arrays.sort(arr);
		
		double res = arr[0];
		
		for(int i = 1 ; i < n ; i++)
		{
			res = (res + arr[i])/2.0;
			
		}
		
		out.println(res);
		
		out.flush();
		out.close();
	}
	
	
	


}
