import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k =Long.parseLong(br.readLine());
		long ans=0;
		for(long i=1; i<=k; i++) ans+=i*f(i);
		System.out.println(ans);

	}
	static long f(long x) {
		long c=0;
		for(int i=1; i<=x; i++) {
			if(x%i==0) ++c;
		}
		return c;
	}
	
}
