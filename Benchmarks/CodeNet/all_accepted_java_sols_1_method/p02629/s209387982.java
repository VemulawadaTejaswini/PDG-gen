import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
	//	for(int k=1;k<=n;k++){
			//int j=k;
		String s="";
		while(n>0)
		{
			int x = (int)(n%26);
			n = n/26;
			if(x==0){
				x=26;
				n--;
			}
			s=s+(char)(97+x-1);
		}
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		System.out.println();//}
		//System.out.println((char)(97+26-1));

	}
}