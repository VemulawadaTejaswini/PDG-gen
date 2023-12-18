import java.util.Scanner;
class exe0206
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
while(true)
{
int l=scan.nextInt();
if(l==0)break;
int sum=0,x=0;
for(int i=0;i<12;i++)
	{
	int m=scan.nextInt();
	int n=scan.nextInt();
	sum+=m-n;
if(sum>l && x==0)x=i;


	}
	if(sum>l)System.out.println(x+1);
	else System.out.println("NA");
}
}
}