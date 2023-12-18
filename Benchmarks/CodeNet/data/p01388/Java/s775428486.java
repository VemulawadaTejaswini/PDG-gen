import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		char c[]=in.next().toCharArray();
		int K=0;
		int U=0;
		int P=0;
		int C=0;
		int ans=0;
		for(int i=0; i<c.length;i++)
		{
			if(c[i]=='K')
				K++;
			if(c[i]=='U')
				U++;
			if(c[i]=='P')
				P++;
			if(c[i]=='C')
				C++;
		}
		while(K-->0&&U-->0&&P-->0&&C-->0)
			ans++;
		System.out.println(ans);
	}
}