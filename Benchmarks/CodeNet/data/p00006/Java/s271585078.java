import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		char tch;
		char[] str = new char[32];
		str = cin.next().toCharArray();
		for(int i=0,j=str.length-1; i<j; i++,j--)
		{
			tch=str[i]; str[i]=str[j]; str[j]=tch;
		}
		
		System.out.println(str);
	}
}