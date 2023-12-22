import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		long sum=0;
		long num1=Long.parseLong(str);
		
		for(long i=0;i<=num1;i++){
			if(i%3!=0&&i%5!=0){
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}
}