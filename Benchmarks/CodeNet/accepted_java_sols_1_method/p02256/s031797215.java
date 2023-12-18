import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int a,b,temp;
	a=scan.nextInt();
	b=scan.nextInt();
	if(b>a)
	    {
		temp=a;
		a=b;
		b=temp;
	    }
	while(a%b!=0)
	    {
		int tmp=b;
		b=a%b;
		a=tmp;
		
		
	    }
	System.out.println(b);
    }
}