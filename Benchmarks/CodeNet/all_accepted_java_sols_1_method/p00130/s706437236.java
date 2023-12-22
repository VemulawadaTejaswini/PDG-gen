import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		while(n--!=0)
		{
			char ch[]=in.next().toCharArray();
			String str = String.valueOf(ch[0]);
			for(int i=3; i<ch.length; i+=3)
			{
				boolean flag = true;
				for(int j=0;j<str.length();j++)
					if(ch[i]==str.charAt(j))
						flag=false;
				if(flag)
					if(ch[i-1]=='>')
						str= str+ch[i];
					else
						str=ch[i]+str;
			}		
			System.out.println(str);
		}
	}
}