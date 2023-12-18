import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n,y,r,t;
		String b;
		n=scan.nextInt();
		if(n==0)break;
		y=scan.nextInt();
		String num[]=new String[n];
		double max=0,gankin=0;
		
		String most="";
		for(int i=0;i<n;i++)
		    {
			b=scan.next();
			r=scan.nextInt();
			t=scan.nextInt();
			if(t==1)
			    {
				for(int j=0;j<y;j++)
				    {
				gankin+=10000*(1+y*(r/100));
				    }
			    }
			else if(t==2)
			    {
				for(int j=0;j<y;j++)
				    {
				gankin+=10000*(Math.pow((1+(r/100)),y));
				    }
			    }
			
			if(max<gankin)
			    {
				max=gankin;
				most=b;
			    }
			
		    }
		System.out.println(most);
	    }
    }
}