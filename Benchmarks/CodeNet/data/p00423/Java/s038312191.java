import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		StringTokenizer token1;
		
	
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			int n=Integer.parseInt(line);
			if(n==0) break;
			int a=0, b=0;
			int sum1=0, sum2=0;
			for(int i=0;i<n;i++){
				line=input.readLine();
				token1 = new StringTokenizer(line);
				a=Integer.parseInt(token1.nextToken());
				b=Integer.parseInt(token1.nextToken());
				if(a>b) sum1+=a+b;
				if(a<b) sum2+=a+b;
				if(a==b) sum1+=a;
				if(a==b) sum2+=b;
			
			}
			System.out.println(sum1+" "+sum2);
		}
	}
}	