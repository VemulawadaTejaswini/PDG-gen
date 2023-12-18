import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
	double a=scan.nextDouble();
	double b[]=new double[10];
	b[0]=a;
	double sum=0;
	for(int i=0;i<10;i++)
	    {
		if(i%2!=0 && i!=0)
		    {
			b[i]=b[i-1]*2;
		    }
		if(i%2==0 && i!=0)
		    {
			b[i]=b[i-1]/3;
		    }
		sum+=b[i];
	    }
	System.out.printf("%.8f\n",sum);
	    }
    }
}