import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		for(int i=0 ; i<ch.length-4;i++)
		{
			if(ch[i] =='a'&&ch[i+1] =='p'&&ch[i+2] =='p'&&ch[i+3] =='l'&&ch[i+4] =='e')
			{
				ch[i]='p';
				ch[i+1]='e';
				ch[i+2]='a';
				ch[i+3]='c';
				ch[i+4]='h';
			}
			else if(ch[i] =='p'&&ch[i+1] =='e'&&ch[i+2] =='a'&&ch[i+3] =='c'&&ch[i+4] =='h')
			{
				ch[i]='a';
				ch[i+1]='p';
				ch[i+2]='p';
				ch[i+3]='l';
				ch[i+4]='e';
			}
		}
		System.out.println(ch);
	}
}