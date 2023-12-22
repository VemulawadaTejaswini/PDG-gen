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
		int s[]=new int[7];
		for(int i=0;i<n;i++)
		    {
			
			int old=scan.nextInt();
			if(old>=70)old=60;
			
			s[old/10]++;
		    }
		for(int i=0;i<7;i++)
		    {
			System.out.println(s[i]);
		    }
	    }
    }
}