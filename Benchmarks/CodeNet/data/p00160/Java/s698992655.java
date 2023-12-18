import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int sum=0;
		int n=scan.nextInt();
		if(n==0)break;
		for(int i=0;i<n;i++)
		    {
			int x,y,h,w;
			x=scan.nextInt();
			y=scan.nextInt();
			h=scan.nextInt();
			w=scan.nextInt();
			if(x+y+h<=60)
			    {
				if(w<=2)sum+=600;
				else sum+=wcheck(w);
			    }
			else if(60<x+y+h && x+y+h<=80)
				{
				    System.out.println("a");
				    if(w<=5)sum+=800;
				    else sum+=wcheck(w);
				}
			else if(80<x+y+h && x+y+h<=100)
				    {

					if(w<=10)sum+=1000;
					else sum+=wcheck(w);
				    }
			else if(100<x+y+h && x+y+h<=120)
				    {

					if(w<=15)sum+=1200;
					else sum+=wcheck(w);
				    }
			else if(120<x+y+h && x+y+h<=140)
				    {

					if(w<=20)sum+=1400;
					else sum+=wcheck(w);
				    }
			else if(140<x+y+h && x+y+h<=160)
				    {

					if(w<=25)sum+=1600;
					
				    }
			
			
		    }
		System.out.println(sum);
	    }
    }
	private static int wcheck(int g)
	{
	    if(g<=2)
		{
		    return 600;
		}
	    else if(2<g && g<=5)
		{
		    return 800;
		}
	    else if(5<g && g<=10)
		{
		    return 1000;
		}
	    else if(10<g && g<=15)
		{
		    return 1200;
		}
	    else if(15<g && g<=20)
		{
		    return 1400;
		}
	    else if(20<g && g<=25)
		{
		    return 1600;
		}
	    return 0;
	}
    
}