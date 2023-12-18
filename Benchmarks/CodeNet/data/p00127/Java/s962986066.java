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
			String s=in.next();
			if(s.length()%2!=0)
				System.out.print("NA");
			else
			{
				for(int i=0;i<s.length()-1;i+=2)
				{
					System.out.print(str[s.charAt(i)-'0'][s.charAt(i+1)-'0']);
				}
			}
			System.out.println();
		}
	}
}