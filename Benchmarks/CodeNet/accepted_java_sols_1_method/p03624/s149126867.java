import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer(sc.nextLine());
		int[] eng=new int[26];
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<26;j++)
			{
				if(j+'a'==str.charAt(i))
				{
					eng[j]++;
				}
			}
		}
		
		int count=0;
		
		for(int i=0;i<26;i++)
		{
			if(eng[i]==0)
			{
				System.out.println((char)(i+'a'));
				break;
			}
			else
			{
				count++;
			}
			if(count==26)
			{
				System.out.println("None");
				break;
			}
		}
	}
}