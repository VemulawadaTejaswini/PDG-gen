import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int max=0;
	int a[]=new int[10];
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<10;i++)
	    {
		a[i]=scan.nextInt();
	    }

	
	for(int i=0;i<3;i++)
	    {
		for(int j=0;j<10;j++)
		    {
			if(max<a[j])
			    max=a[j];
		
		    }
		for(int k=0;k<10;k++)
		    {
			if(max==a[k])
			    {
				a[k]=0;
			    }
		
		    }
		System.out.println(max);
		max=0;
	
	    }
    }
}