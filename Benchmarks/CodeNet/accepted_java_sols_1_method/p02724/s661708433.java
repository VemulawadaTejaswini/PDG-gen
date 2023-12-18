import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int x=Integer.parseInt(in.readLine());
		long ans=0;
		while(x>=500)
		{
		    ans+=1000;
		    x-=500;
		}
		while(x>=5)
		{
		    ans+=5;
		    x-=5;
		}
		System.out.println(ans);
	}
}
