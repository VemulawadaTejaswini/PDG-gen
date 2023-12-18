import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();
			char c[]=in.next().toCharArray();
			int cnt=0;
			for(int i=0;i<N;i++)
			{
				char old[]=in.next().toCharArray();
				for(int j=0;j<old.length;j++)
				{
					for(int k=1;k+(c.length-1)*k<old.length;k++)//文字間隔を全通り試す
					{
						boolean judge=true;
						for(int l=0;l<c.length;l++)
						{
							if(j+l*k<old.length&&old[j+l*k]!=c[l])
							{
								judge=false;
								break;
							}
						}
						if(judge)
						{
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}