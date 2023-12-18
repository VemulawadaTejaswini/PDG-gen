import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n,p,d1,d2,maxp=0,maxd=0;
		n=scan.nextInt();
		if(n==0)break;
		for(int i=0;i<n;i++)
		    {
			p=scan.nextInt();
			d1=scan.nextInt();
			d2=scan.nextInt();
			if(maxd<d1+d2)
			    {
				maxp=p;
				maxd=d1+d2;
			    }
		    }
		
		System.out.println(maxp+" "+maxd);
	    }
    }
}