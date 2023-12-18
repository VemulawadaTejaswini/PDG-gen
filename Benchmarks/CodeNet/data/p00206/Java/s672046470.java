import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
while(true)
{
int l=scan.nextInt();
if(l==0)break;
int sum=0,x=0;
for(int i=1;i<=12;i++)
	{
	int m,n;
	m=scan.nextInt();
	n=scan.nextInt();
	sum+=m-n;
	
if(sum>=l && x==0)x=i;
System.out.println(sum+" "+x);

	}
	if(sum>=l)System.out.println(x+1);
	else System.out.println("NA");
}
}
}