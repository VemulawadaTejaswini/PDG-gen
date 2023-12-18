import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int i;
	int max[]=new int[3];
	int a[]=new int[10];
	Scanner scan=new Scanner(System.in);
	for(i=0;i<10;i++)
	    {
		a[i]=scan.nextInt();
	    }
	for(i=0;i<3;i++)
	    {
		int tmp=a[i];
		for(int j=0;j<10;j++)
		    {
			if(max[i]<a[i])
			    {
				max[i]=a[j];
				a[j]=-1;
			    }
		    
			
		    }
		System.out.println(max[i]);
	    }
    }
}