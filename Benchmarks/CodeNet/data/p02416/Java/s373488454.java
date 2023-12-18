import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int x,a,b,c,d;
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		d=0;
		x=scan.nextInt();
		if(x==0)
		    {
			break;	
		    }
		a=x%1000;
		b=a%100;
		c=b%10;
		d+=x/1000;		
		d+=a/100;			
		d+=b/10;			
			System.out.println((d+c));
			
	    }
    }
}
			