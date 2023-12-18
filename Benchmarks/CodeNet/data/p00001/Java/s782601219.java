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
		for(int j=0;j<10;j++)
		    {
			if(max[i]<a[j])
			    max[i]=a[j];	
		    }
		for(int k=0;k<10;k++)
		    {
			if(max[i]==a[k])
			    {
				a[k]=0;
			    }
		    }
		System.out.println(max[i]);
	    }
    }
}