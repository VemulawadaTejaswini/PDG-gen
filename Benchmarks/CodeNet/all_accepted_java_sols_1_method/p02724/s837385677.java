import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(bu.readLine());
		long ans=0;
		ans=1000l*(k/500);
		k=k%500;
		ans+=(k/5)*5;
		System.out.print(ans);
	}
}