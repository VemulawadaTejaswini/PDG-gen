import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
    int a[]=new int[20];
    int i=0;
    while(scan.hasNext())
	    {
		if(i==20)break;
		a[i]=scan.nextInt();
		if(a[i]==0)
		    {
			int j=i;
			while(a[j]==0)j--;
			System.out.println(a[j]);
			a[j]=0;
		    }
		i++;
	    }
    }
}