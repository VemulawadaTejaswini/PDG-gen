import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			char c[]=in.next().toCharArray();
			if(c[0]=='#')
				return;
			char state='A';
			boolean judge=true;
			for(int i=0;i<c.length;i++)
			{
				if(state=='A')
				{
					if(c[i]=='0')
						state='X';
					else
						state='Y';
				}
				else if(state=='X')
				{
					if(c[i]=='0')
						judge=false;
					else
						state='Z';
				}
				else if(state=='Y')
				{
					if(c[i]=='0')
						state='X';
					else
						judge=false;
				}
			    else if(state=='Z')
				{
					if(c[i]=='0')
						state='W';
					else
						state='B';
				}
			    else if(state=='W')
				{
					if(c[i]=='0')
						state='B';
					else
						state='Y';
				}
			    else if(state=='B')
				{
					if(c[i]=='0')
						state='Y';
					else
						state='X';
				}
				if(!judge)
					break;
				if(i==c.length-1)
				{
					if(state=='B')
						break;
					else
						judge=false;
				}
			}
			System.out.println(judge ? "Yes":"No");
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}