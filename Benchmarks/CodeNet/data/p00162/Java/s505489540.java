import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int m,n;
		m=scan.nextInt();
		if(m==0)break;
		n=scan.nextInt();
		
		int i=1;
		while(true)
		    {
			if(n<=Math.pow(i,3))break;
			i++;
		    }
		
		
		int count=0;
		for(int j=m;j<=n;j++)
		    {
			if(Math.pow(60,i)%j==0 && j%25!=0)
			    {
				System.out.println(j);
				count++;
			    }
		    }
		System.out.println(count);
	    }
    }
}