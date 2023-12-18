import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String st=in.next();
			int ans=0;
			int cntJ=0;
			int cntO=0;
			int cntI=0;
			int fo=0;
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)=='O')
					fo=i-1;
				while(i<st.length()&&st.charAt(i)=='O')
				{
					cntO++;
					i++;
				}
				while(i<st.length()&&st.charAt(i)=='I')
				{
					cntI++;
					i++;
				}
				while(fo>=0&&st.charAt(fo)=='J')
				{
					cntJ++;
					fo--;
				}
				if(cntO<=cntI&&cntO<=cntJ)
				{
					ans=Math.max(ans, cntO);
				}
				cntJ=cntO=cntI=0;
			}
			System.out.println(ans);
		}
	}
}