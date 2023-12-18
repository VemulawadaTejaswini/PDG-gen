import java.util.HashMap;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int door=0;//初期状態は施錠
			HashMap<String, String> hm=new HashMap<String, String>();
			for(int i=0;i<n;i++)
			{
				String st=in.next();
				hm.put(st,st);
			}
			int m=in.nextInt();
			for(int i=0;i<m;i++)
			{
				String id=in.next();
				if(id.equals(hm.get(id)))
				{
					if(door==0)
					{
						System.out.println("Opened by"+" "+id);
						door=1;
					}
					else
					{
						System.out.println("Closed by"+" "+id);
						door=0;
					}
				}
				else
					System.out.println("Unknown "+id);
			}
		}
	}
}