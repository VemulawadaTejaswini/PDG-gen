import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k =Long.parseLong(br.readLine());
		long ans=0;
		//y=k/i i.e. maximum number not exceeding k.
		for(long i=1; i<=k; i++) ans+=((k/i)*((k/i)+1)*i/2);
		System.out.println(ans);
	}
	
	
}
