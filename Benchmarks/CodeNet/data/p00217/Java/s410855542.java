import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n,p,d1,d2;
		n=scan.nextInt();
		if(n==0)break;
		int s[][]=new int[n][2];
		for(int i=0;i<n;i++)
		    {
			s[i][0]=scan.nextInt();
			d1=scan.nextInt();
			d2=scan.nextInt();
			s[i][1]=d1+d2;
		    }
		int max=s[0][1],top=s[0][0];

		for(int i=0;i<n;i++)
		    {
			if(max<s[i][1])
			    {
				max=s[i][1];
				top=s[i][0];
			    }
		    }

		System.out.println(top+" "+max);
	    }
    }
}