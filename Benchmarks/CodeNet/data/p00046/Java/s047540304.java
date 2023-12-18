import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	float high=0,low=0,x,ans=0;
	int i=0;
	while(scan.hasNext())
	    {		
		x=scan.nextFloat();
		if(i==0)
		    {
			low=x;
		    }
		
		if(high<x)high=low;
		if(low>x)low=x;
		ans=high-low;
		
		i++;
	    }
	System.out.println(ans);
    }
}