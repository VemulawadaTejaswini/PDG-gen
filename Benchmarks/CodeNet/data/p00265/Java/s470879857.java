import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);



int n,q;
n=scan.nextInt();
q=scan.nextInt();
int c[]=new int[n];





for(int i=0;i<n;i++)
{
c[i]=scan.nextInt();

}
for(int i=0;i<n;i++)
{
int max=0;

int x=scan.nextInt();

	for(int j=0;j<q;j++)
	{
	
	if(max<c[j]%x)max=c[j]%x;
	}
	System.out.println(max);
}
}
}