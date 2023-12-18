import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n,x,m=0;

	while(true)	
	    {
	n=scan.nextInt();
	x=scan.nextInt();
	if(n==0 && x==0)break;
		for(int i=1;i<=n;i++)
		    {
			for(int j=1;j<=n;j++)
			    {
				for(int k=1;k<=n;k++)
				    {
					if(((i+j+k)==x) && (i<j) && (j<k))
					    {
						m++;
					
					    }
				    }
			    }
		    }
		System.out.println(m);
		m=0;
	    }
	
    }
}