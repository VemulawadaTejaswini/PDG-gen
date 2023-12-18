import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int [3];
		int n=in.nextInt();
        for(int i=2;i>=0;i--)		{
		    a[i]=n%10;
		    if(a[i]==1)
		        a[i]=9;
		    else if(a[i]==9)
		        a[i]=1;
		    n=(n-(n%10))/10;
		}
		for(int i=0;i<3;i++)
		    System.out.print(a[i]);
	}
}