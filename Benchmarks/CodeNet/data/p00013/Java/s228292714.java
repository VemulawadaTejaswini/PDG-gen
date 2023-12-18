import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
		int a[]=new int[20];
		int i=0;
			a[i]=scan.nextInt();
			if(a[i]==0)
			    {
				while(true)
				    {
					int j=i;
					if(a[j]!=0)
					    {
						System.out.println(a[j]);
						break;
					    }
					j--;
				    }
			    }
			i++;	
	    }
    }
}