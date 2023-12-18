import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
    int a[]=new int[10];
    int i=0;
    while(scan.hasNext())
	    {
		if(i==10)break;
		int n=scan.nextInt();
		if(n==0)
		    {
			System.out.println(a[i-1]);
			i--;
		    }
		else
		    {
		a[i]=n;
		i++;
		    }
	    }
    }
}