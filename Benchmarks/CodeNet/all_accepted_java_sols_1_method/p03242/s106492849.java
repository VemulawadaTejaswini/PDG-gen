import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		char ch[] = String.valueOf(n).toCharArray();
		for(int i=0;i<3;i++)
		{
			if(ch[i]==49)
				ch[i]=57;
			else
				ch[i]=49;
		}
		System.out.println(ch);
	}
}
