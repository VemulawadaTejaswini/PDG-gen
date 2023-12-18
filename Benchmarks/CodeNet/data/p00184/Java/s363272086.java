import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	
	while(true)
	    {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==0)break;
		int s[]=new int[7];
		for(int i=0;i<n;i++)
		    {
			
			int old=scan.nextInt();
			int x=old/10;
			if(x>=6)x=6;
			s[x]++;
		    }
		for(int i=0;i<7;i++)
		    {
			System.out.println(s[i]);
		    }
	    }
    }
}