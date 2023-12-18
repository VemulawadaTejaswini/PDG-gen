import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k =Long.parseLong(br.readLine());
		long ans=0;
		for(long i=1; i<=k; i++) 
			for(long j=1; j<=k; j++)
				if(i%j==0) ans+=i;
		System.out.println(ans);
		

	}
	
	
}