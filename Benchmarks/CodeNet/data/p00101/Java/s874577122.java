import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in); 
		int n=in.nextInt();
		String a=in.nextLine();
		while(n--!=0)
		{
			char ch[] = in.nextLine().toCharArray();
			for(int i=0 ; i<ch.length-6; i++)
			{
				if(ch[i]=='H'&&ch[i+1]=='o'&&ch[i+2]=='s'&&ch[i+3]=='h'&&ch[i+4]=='i'&&ch[i+5]=='n'&&ch[i+6]=='o')
				{
					ch[i+6]='a';	
				}
			}
			System.out.println(ch);
		}
	}
}