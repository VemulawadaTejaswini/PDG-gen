
import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		long x=Integer.valueOf(cmd[0]);
		long ans1=0;
		long ans2=0;
		for(long i=-1000;i<=1000;i++)
		{
			long a=(long)Math.pow(i, 5);
			for(long j=-1000;j<=1000;j++)
			{
				long b=(long)Math.pow(j, 5);
				if(a-b==x)
				{
					ans1=i;
					ans2=j;
					break;
				}
			}
		}
		System.out.println(ans1+" "+ans2);
	}

}
