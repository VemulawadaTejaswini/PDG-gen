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
		
		
		
		int ans=0,x=0,near=0;
		for(int i=0;i<n;i++)
		    {
			int num=scan.nextInt();
			int h,w;
			h=scan.nextInt();
			w=scan.nextInt();
			int bmi=(int)((double)w/(h*h)*10000);
			
			
			if(bmi>=22)x=bmi-22;
			else x=22-bmi;
			if(i==0 && bmi>=22)near=bmi-22;
			else if(i==0 && bmi<22)near=22-bmi;
			if(near>x)
			    {
				near=x;
				ans=num;
			    }
		    }
		System.out.println(ans);
	    }
    }
}