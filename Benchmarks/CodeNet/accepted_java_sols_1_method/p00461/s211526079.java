import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int f=in.nextInt();
			char[] ch=in.next().toCharArray();
			int ans=0;
			int re=0;
			for(int i=0;i<f-2;i++)
			{
				if(ch[i]=='I')
				{
					if(ch[i+1]=='O'&&ch[i+2]=='I')
						re++;
					else
						re=0;
					if(re>=n)
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}