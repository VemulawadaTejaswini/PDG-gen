import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in =new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int s=in.nextInt();
			if((n|s)==0)
				return;
			LinkedList<Integer> L=new LinkedList<Integer>();
			LinkedList<Integer> tmp=new LinkedList<Integer>();
			for(int i=1;i<=n;i++)
				L.add(i);
			while(s-->0)
			{
				int p=in.nextInt();
				int c=in.nextInt();
				for(int i=0;i<c;i++)
					tmp.add(L.get(n-p-i));
				for(int i=0;i<c;i++)
					L.remove(n-p-i);
				for(int i=c-1;i>=0;i--)
				{
					L.add(tmp.get(i));
					tmp.remove(i);
				}
			}
			System.out.println(L.getLast());
		}
	}
}