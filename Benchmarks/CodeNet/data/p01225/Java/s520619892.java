import java.util.*;
public class Main
{
	public static int a[];
	public static String b[];
	public static int p[]=new int[9];
	public static String p2[]=new String[9];
	public static boolean judge;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int I=in.nextInt();
		while(I-->0)
		{
			a=new int[9];
			b=new String[9];
			judge=false;
			boolean use[]=new boolean[9];
			for(int i=0;i<9;i++)
				a[i]=in.nextInt();
			for(int i=0;i<9;i++)
				b[i]=in.next();

			make_perm(0,p,p2,use);
			System.out.println(judge ? 1:0);
		}
	}

	static void make_perm(int n,int p[],String p2[],boolean use[])
	{
		if(judge)
			return;
		if(n==9)
			check(p,p2);
		else 
		{
			for(int i=0;i<9;i++)
			{

				if(use[i]) 
					continue;
				p[n]=a[i];
				p2[n]=b[i];
				use[i] = true;
				make_perm(n+1,p,p2,use);
				use[i] = false;
			}
		}
	}

	static void check(int p[], String p2[])
	{
		if((p[0]+1==p[1]&&p[1]+1==p[2])||(p[0]==p[1]&&p[1]==p[2]))
		{
			if(p2[0].equals(p2[1])&&p2[1].equals(p2[2]))
				judge=true;
			else
				return;
		}
		else 
		{
			judge=false;
			return;
		}
		if(p[3]+1==p[4]&&p[4]+1==p[5]||(p[3]==p[4]&&p[4]==p[5]))
		{
			if(p2[3].equals(p2[4])&&p2[4].equals(p2[5]))
				judge=true;
			else
			{
				judge=false;
				return;
			}
		}
		else
		{
			judge=false;
			return;
		}
		if(p[6]+1==p[7]&&p[7]+1==p[8]||(p[6]==p[7]&&p[7]==p[8]))
		{
			if(p2[6].equals(p2[7])&&p2[7].equals(p2[8]))
				judge=true;
			else
			{
				judge=false;
				return;
			}
		}
		else
		{
			judge=false;
			return;
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}