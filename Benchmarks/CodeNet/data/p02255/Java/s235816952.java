import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	
	
	int c[]=new int[n];
	for(int i=0;i<n;i++)
	    {
		c[i]=scan.nextInt();
	    }
	
	
	for(int i=1;i<n;i++)
	    {
		for(int k=0;k<n;k++)
		    {
			System.out.print(c[k]+((k!=n-1)?" ":""));
		    }
		int j=i;
		while(j>=1 && c[j-1]>c[j])
		    {
			
			int temp=c[j];
			c[j]=c[j-1];
			c[j-1]=temp;
			
			j--;
			
		    }
		
		System.out.println();
		
	    }
	for(int k=0;k<n;k++)
		    {
			System.out.print(c[k]+((k!=n-1)?" ":""));
		    }
	System.out.println();
    }
}