import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		String str[][]=
			{
				{},
				{"","a","b","c","d","e"},
				{"","f","g","h","i","j"},
				{"","k","l","m","n","o"},
				{"","p","q","r","s","t"},
				{"","u","v","w","x","y"},
				{"","z",".","?","!"," "},
			};
		while(in.hasNext())
		{	
			int ju=0;
			String s=in.next();
			for(int i=0;i<s.length()-1;i++)
			{
				
				if(s.charAt(i)-'0'>6||s.charAt(i)-'0'<=0)
				{
					ju=1;
					break;
				}
				i++;
				if(s.charAt(i)-'0'>5||s.charAt(i)-'0'<=0)
				{
					ju=1;
					break;
				}
			}
			String ans="";
			if(s.length()%2!=0||ju==1)
				System.out.println("NA");
			else
			{
				for(int i=0;i<s.length()-1;i+=2)
				{
					ans+=(str[s.charAt(i)-'0'][s.charAt(i+1)-'0']);
				}
				System.out.println(ans);
			}
		}
	}
}