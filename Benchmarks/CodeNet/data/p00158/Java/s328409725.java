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
		int count=0;
		
		while(n!=1)
		    {
			if(n%2==0)n/=2;
			else n=3*n+1;
			count++;
		    }
		System.out.println(count);
	    }
    }
}