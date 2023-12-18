import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n=scan.nextInt();
		int max=0,min=0;
		for(int i=n;i>2;i--)
		    {
			int j;
			for(j=n;j>2;j--)
			    {
				if(i%j==0 || (i+2)%j==0)break;
			    }
			if(i==j)
			    {
				max=i;
				min=i+2;
				break;
			    }
		    }
		System.out.println(max+" "+min);
		
	    }
    }
}