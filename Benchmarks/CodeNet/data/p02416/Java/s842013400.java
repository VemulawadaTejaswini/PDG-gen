import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int x;
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		
		int a,b,c,d=0;
		x=scan.nextInt();
		if(x==0)break;
		
			d+=x/1000;
			a=x%1000;
			d+=a/100;
			b=a%100;
			d+=b/10;
			c=b%10;
			System.out.println((d+c));
			d=0;
	    }
    }
}
			