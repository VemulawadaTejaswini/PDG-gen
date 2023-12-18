import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			String st=in.next();
			if(st.equals("0"))
				return;
			LinkedList<String> que=new LinkedList<String>();
			int ans=0;
			int flag=0;
			char ch[]=new char[10];
			que.push(st);
			while(!que.isEmpty())
			{
				int size=que.size();
				for(int i=0;i<size;i++)
				{
					ch=que.poll().toCharArray();
					for(int j=0;j<ch.length-1;j++)//全ての色が同じかチェック
					{
						if(ch[j]==ch[j+1])
							flag=1;
						else
						{
							flag=0;
							break;
						}
					}
					if(flag==1)
						break;
					for(int j=0;j<ch.length-1;j++)
					{
						char ch2[]=new char[ch.length];
						for(int k=0;k<ch.length;k++)
							ch2[k]=ch[k];
						if(ch[j]!=ch[j+1])
						{
							String tmp="";
							if(ch2[j]!='r'&&ch2[j+1]!='r')
								ch2[j]=ch2[j+1]='r';
							else if(ch2[j]!='g'&&ch2[j+1]!='g')
								ch2[j]=ch2[j+1]='g';
							else if(ch2[j]!='b'&&ch2[j+1]!='b')
								ch2[j]=ch2[j+1]='b';
							for(int k=0;k<ch.length;k++)
								tmp+=ch2[k];
							que.add(tmp);
						}
					}
				}
				if(flag==1)
					break;
				ans++;
				//System.out.println(ans);
				if(ans>8)
					break;
			}
			System.out.println(ans>8? "NA":ans);
		}
	}
}