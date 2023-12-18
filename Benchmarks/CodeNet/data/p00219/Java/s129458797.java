import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int count[]=new int[10];
while(true)
{
int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
	int kind=scan.nextInt();
	count[kind]++;
	}
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<count[i];j++)
		{
		System.out.print("*");
		}
		if(count[i]==0)System.out.println("-");
		System.out.println();
	}
}
}
}