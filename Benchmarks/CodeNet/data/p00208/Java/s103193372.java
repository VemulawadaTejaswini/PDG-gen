import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	while (true)
	{
	int n=scan.nextInt();
	long count=0;
	if(n==0)break;
		for(long i=0;i<=n+count;i++)
		{
		String str=Long.toString(i);
		for(int j=0;j<str.length();j++)
		{
		if(str.charAt(j)=='4' || str.charAt(j)=='6')
		{
		//System.out.println(i);
		count++;
		break;
		}
		}
		}
		System.out.println(n+count);
	}
	}
}