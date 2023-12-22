import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		String ans="";
		int n=scan.nextInt();
		if(n==-1)break;
		while(true)
		    {
			String sub;
			sub=Integer.toString(n%4);
			ans=sub+ans;
			n=n/4;
			if(n==0)break;
		    }
		System.out.println(ans);
	    }
    }
}