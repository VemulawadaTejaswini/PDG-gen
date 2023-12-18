import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
	int n=scan.nextInt();
	int i=0,field=0;
	if(n==1 || n==2)field=2*n;
	else
	    {
		
	for(i=1;i<n;i*=2)
	    {
	field=2*n+(2*i-1);
	
	
	    }
	    }
	System.out.println(field);
    }
    }
}