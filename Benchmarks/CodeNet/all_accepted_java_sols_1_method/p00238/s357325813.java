import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int t,n,count=0;
		t=scan.nextInt();
		if(t==0)break;
		n=scan.nextInt();
		for(int i=0;i<n;i++)
		    {
			int s,f;
			s=scan.nextInt();
			f=scan.nextInt();
			for(int j=s;j<f;j++)
			    {
				count++;
			    }
		    }
		if(count>=t)System.out.println("OK");
		else System.out.println(t-count);
	    }
    }
}