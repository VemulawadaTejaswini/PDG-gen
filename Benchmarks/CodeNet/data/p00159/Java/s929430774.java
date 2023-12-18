import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n=scan.nextInt();
		if(n==0)break;
		int num[]=new int[n];
		double bmi;
		
		int ans=0,x=0,near=10000;
		for(int i=0;i<n;i++)
		    {
			num[i]=scan.nextInt();
			int h,w;
			h=scan.nextInt();
			w=scan.nextInt();
			bmi=(double)w/(h*h)*10000;
			
			int bmi_int=(int)bmi;
			
			if(bmi_int>=22)x=bmi_int-22;
			else x=22-bmi_int;
				 
			if(near>x)
			    {
				near=x;
				ans=i;
			    }
		    }
		System.out.println(num[ans]);
	    }
    }
}