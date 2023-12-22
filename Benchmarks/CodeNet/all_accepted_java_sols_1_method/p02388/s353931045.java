import java.io.*;
class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int x;
		int sum=0;
		x=Integer.parseInt(br.readLine());
		sum=x*x*x;
		System.out.println(sum);
	}
}