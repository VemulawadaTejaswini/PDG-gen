import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
		int n=scan.nextInt();
		int counter=0;
		for(int i=2;i<=n;i++)
		    {
			int j;
			for(j=2;j<i;j++)
			    {
				if(i%j==0)break;
			    }
			if(i==j)counter++;
		    }
		System.out.println(counter);
	    }
    }
}