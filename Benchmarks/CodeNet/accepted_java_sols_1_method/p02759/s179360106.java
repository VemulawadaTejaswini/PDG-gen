import java.util.*;
import java.io.*;
import java.lang.Exception;

public class Main{
	public static void main(String[] args)
			throws IOException
	{
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		int i=0;

		int a=Integer.parseInt(br.readLine());
		i=1+a/2;
		if(a%2==0)
			i=a/2;
		System.out.println(i);
		

	}
}