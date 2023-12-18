import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		char ch[]=in.next().toCharArray();
		char af[] = new char[ch.length];
		char p = 3;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='A')
				af[i]='X';
			else if(ch[i]=='B')
				af[i]='Y';
			else if(ch[i]=='C')
				af[i]='Z';
			else
			af[i]= (char)(ch[i]-p);	
		}
		System.out.println(af);
	}
}