import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
	int n=scan.nextInt();
	if(n==0)break;
	int a=0,b=0;
	for(int i=0;i<n;i++)
	    {
		int x,y;
		x=scan.nextInt();
		y=scan.nextInt();
		if(x>y)a+=x+y;
		else if(x<y)b+=x+y;
		else 
		    {
			a+=x;
			b+=y;
		    }

	    }
System.out.println(a+" "+b);
	    }
    }
}